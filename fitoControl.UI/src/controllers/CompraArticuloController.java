package controllers;

import FitoControl.DataBase.BaseDatosRepositorio.ArticuloBaseDatosRepositorio;
import FitoControl.DataBase.BaseDatosRepositorio.CompraBaseDeDatosRepositorio;
import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.Compra;
import FitoControl.DataBase.modelo.CompraArticulo;
import FitoControl.DataBase.modelo.Modelo;
import java.sql.SQLException;
import java.util.ArrayList;
import observers.CompraArticuloObserver;
import view.CompraArticuloView;

public class CompraArticuloController {

    private final ArticuloBaseDatosRepositorio articuloReposiorio = new ArticuloBaseDatosRepositorio();
    private final CompraBaseDeDatosRepositorio CompraArticuloReposiorio = new CompraBaseDeDatosRepositorio();
    private final CompraArticuloView view;
    private final Compra compra;
    private ArrayList<Modelo> compraArticulos = new ArrayList<>();
    private ArrayList<Modelo> articulos = new ArrayList<>();
    private CompraArticulo CompraArticuloSeleccionada = new CompraArticulo();
    private CompraArticuloObserver observer = null;

    public CompraArticuloController(CompraArticuloView view, Compra compra) {
        this.view = view;
        this.compra = compra;

        observer = new CompraArticuloObserver(view);
        view.setViewMode(compra);
    }

    public void cargar() throws SQLException, ClassNotFoundException {
        compraArticulos = CompraArticuloReposiorio.ObtenerArticulos(compra.Id);
        articulos = articuloReposiorio.ObtenerTodos();
        view.cargar(compraArticulos, articulos);
    }

    public void seleccionar(int id) {
        for (Modelo modelo : compraArticulos) {
            if (modelo.Id == id) {
                CompraArticulo compraArticulo = (CompraArticulo) modelo;
                CompraArticuloSeleccionada = compraArticulo;
                CompraArticuloSeleccionada.setArticulo(compraArticulo.getArticulo());
                break;
            }
        }
    }

    public void eliminar() throws Exception {
        CompraArticuloReposiorio.eliminar(CompraArticuloSeleccionada);
        nuevo();
    }

    public void nuevo() {
        CompraArticuloSeleccionada = new CompraArticulo();
        CompraArticuloSeleccionada.addObserver(observer);
        CompraArticuloSeleccionada.setCantidad(0);
        CompraArticuloSeleccionada.setPrecio(0);

    }

    public void guardarActualizar(Articulo articulo, double cantidad, double precio) throws Exception {
        CompraArticuloSeleccionada.setArticulo(articulo);
        CompraArticuloSeleccionada.setCantidad(0);
        CompraArticuloSeleccionada.setPrecio(0);

        if (CompraArticuloSeleccionada.Id == 0) {
            CompraArticuloSeleccionada = (CompraArticulo) CompraArticuloReposiorio.añadir(CompraArticuloSeleccionada);
        } else {
            CompraArticuloReposiorio.actualizar(CompraArticuloSeleccionada);
        }
    }

}
