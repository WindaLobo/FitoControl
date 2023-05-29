package controllers;

import FitoControl.DataBase.baseDatosRepositorio.ArticuloBaseDatosRepositorio;
import FitoControl.DataBase.baseDatosRepositorio.ManoSulfatoBaseDeDatosRepositorio;
import FitoControl.DataBase.baseDatosRepositorio.TipoMedidaUtil;
import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.ManoSulfato;
import FitoControl.DataBase.modelo.ManoSulfatoArticulo;
import FitoControl.DataBase.modelo.Modelo;
import FitoControl.DataBase.modelo.TipoMedida;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
        view.cargar(manoSulfato.getArticulos());
        view.cargarProductos(articulos);
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
        manoSulfatoSeleccionada.setArticulo((Articulo) articulos.get(0));
    }

    public void guardar() throws SQLException, Exception {
        if (view.pedirConfirmacion("Seguro que desea guardarla?") == 0) {
            manoSulfato.setFecha(Date.from(Instant.now()));
            ArrayList<Articulo> articulosRecalculados = recalcularCantidadProductos();
            manoSulfatoReposiorio.añadir(manoSulfato);
            articuloReposiorio.actualizar(articulosRecalculados);
            manoSulfatoController.cargar();
            view.cerrar();
        }
    }

    public void eliminar() throws Exception {
        manoSulfato.getArticulos().remove(manoSulfatoSeleccionada);
        view.cargar(manoSulfato.getArticulos());
        nuevo();
    }

    public void añadir(Articulo articulo, TipoMedida idMedida, double cantidad) {

        double cantidadAjustada = 0;

        if (cantidad == 0) {
            view.mostrarError("La cantidad no puede ser 0.");
            return;
        }

        if (productoExiste(articulo)) {
            view.mostrarError("Este articulo ya esta incluido en la mano de sulfato actual.");
            return;
        }

        cantidadAjustada = TipoMedidaUtil.obtenerCantidadAjustadaATipoMedida(articulo, idMedida, cantidad);

        if (articulo.getCantidad() - cantidadAjustada < 0) {
            view.mostrarError("No puedes aplicar mano sulfato por que no tienes suficiente stock.");
        } else {
            ManoSulfatoArticulo detalle = new ManoSulfatoArticulo(getNextId(), articulo, idMedida, cantidad);
            manoSulfato.añadirArticulo(detalle);
            manoSulfatoSeleccionada = detalle;
            manoSulfatoSeleccionada.addObserver(observer);
            view.cargar(manoSulfato.getArticulos());
        }
    }

    private ArrayList<Articulo> recalcularCantidadProductos() {

        ArrayList<Articulo> articulosRecalculados = new ArrayList<Articulo>();

        for (ManoSulfatoArticulo detalle : manoSulfato.getArticulos()) {
            Articulo articulo = detalle.getArticulo();

            double cantidadAjustada
                    = TipoMedidaUtil.obtenerCantidadAjustadaATipoMedida(articulo,
                            detalle.getIdMedida(), detalle.getCantidad());

            BigDecimal value = new BigDecimal(articulo.getCantidad() - cantidadAjustada)
                    .setScale(2, RoundingMode.HALF_UP);

            articulo.setCantidad(value.doubleValue());

            articulosRecalculados.add(articulo);
        }

        return articulosRecalculados;
    }

    private boolean productoExiste(Articulo articuloAñadir) {
        for (ManoSulfatoArticulo articulo : manoSulfato.getArticulos()) {
            if (articulo.getArticulo().Id == articuloAñadir.Id) {
                return true;
            }
        }

        return false;
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
