package controllers;

import FitoControl.DataBase.BaseDatosRepositorio.ArticuloBaseDatosRepositorio;
import FitoControl.DataBase.BaseDatosRepositorio.ManoSulfatoBaseDeDatosRepositorio;
import FitoControl.DataBase.BaseDatosRepositorio.TipoMedidaUtil;
import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.ManoSulfato;
import FitoControl.DataBase.modelo.ManoSulfatoArticulo;
import FitoControl.DataBase.modelo.Modelo;
import FitoControl.DataBase.modelo.TipoMedida;
import java.sql.SQLException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import observers.ManoSulfatoArticuloObserver;
import view.ManoSulfatoArticuloView;

public class ManoSulfatoArticuloController {

    private final ArticuloBaseDatosRepositorio articuloReposiorio = new ArticuloBaseDatosRepositorio();
    private final ManoSulfatoBaseDeDatosRepositorio manoSulfatoReposiorio = new ManoSulfatoBaseDeDatosRepositorio();
    private final ManoSulfatoArticuloView view;
    private final ManoSulfato manoSulfato;
    private ArrayList<Modelo> articulos = new ArrayList<>();
    private ManoSulfatoArticulo manoSulfatoSeleccionada = new ManoSulfatoArticulo();
    private ManoSulfatoArticuloObserver observer = null;
    private final ManoSulfatoController manoSulfatoController;

    public ManoSulfatoArticuloController(ManoSulfatoController manoSulfatoController, ManoSulfatoArticuloView view, ManoSulfato manoSulfato) {
        this.view = view;
        this.manoSulfato = manoSulfato;
        this.manoSulfatoController = manoSulfatoController;
        observer = new ManoSulfatoArticuloObserver(view);

    }

    public void cargar() throws SQLException, ClassNotFoundException {

        articulos = articuloReposiorio.ObtenerTodos();
        boolean esNuevaCompra = manoSulfato.Id == 0;

        if (!esNuevaCompra) {

            manoSulfato.setArticulos(manoSulfatoReposiorio.obtenerArticulos(manoSulfato.Id));
        }

        for (Modelo articulo : manoSulfato.getArticulos()) {
            articulo.addObserver(observer);
        }

        view.setViewMode(manoSulfato);
        view.cargar(manoSulfato.getArticulos(), articulos);

    }

    public void seleccionar(int id) {
        for (ManoSulfatoArticulo manoSulfatoarticulo : manoSulfato.getArticulos()) {
            if (manoSulfatoarticulo.Id == id) {
                manoSulfatoSeleccionada = manoSulfatoarticulo;
                manoSulfatoSeleccionada.setArticulo(manoSulfatoarticulo.getArticulo());
                break;
            }
        }
    }

    public void nuevo() {
        manoSulfatoSeleccionada = new ManoSulfatoArticulo();
        manoSulfatoSeleccionada.addObserver(observer);
        manoSulfatoSeleccionada.setCantidad(0);
        manoSulfatoSeleccionada.setArticulo(new Articulo());
        manoSulfatoSeleccionada.setIdMedida(null);

    }

    public void guardar() throws SQLException, Exception {
        manoSulfato.setFecha(Date.from(Instant.now()));
        manoSulfatoReposiorio.añadir(manoSulfato);
        manoSulfatoController.cargar();

    }

    public void eliminar() throws Exception {
        manoSulfato.getArticulos().remove(manoSulfatoSeleccionada);
        view.cargar(manoSulfato.getArticulos(), articulos);
        nuevo();
    }

    public void añadir(Articulo articulo, TipoMedida idMedida, double cantidad) {

         TipoMedidaUtil.obtenerCantidadAjustadaATipoMedida(articulo, idMedida, cantidad);

        if (articulo.getCantidad() - cantidad < 0) {
            view.mostrarError("No puedes aplicar mano sulfato por que no tienes suficiente stock");
        } else {
            ManoSulfatoArticulo detalle = new ManoSulfatoArticulo(getNextId(), articulo, idMedida, cantidad);
            manoSulfato.añadirArticulo(detalle);
            manoSulfatoSeleccionada = detalle;
            manoSulfatoSeleccionada.addObserver(observer);
            view.cargar(manoSulfato.getArticulos(), articulos);
        }
    }

    private int getNextId() {
        int nextId;
        var articulos = manoSulfato.getArticulos();

        if (!articulos.isEmpty()) {

            Modelo last = articulos.get(articulos.size() - 1);

            nextId = last.Id + 1;

        } else {

            nextId = 1;
        }

        return nextId;
    }

}
