package controllers;

import FitoControl.DataBase.BaseDatosRepositorio.ArticuloBaseDatosRepositorio;
import FitoControl.DataBase.BaseDatosRepositorio.CompraBaseDeDatosRepositorio;
import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.Compra;
import FitoControl.DataBase.modelo.CompraArticulo;
import FitoControl.DataBase.modelo.Modelo;
import java.sql.SQLException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import observers.CompraArticuloObserver;
import view.CompraArticuloView;

public class CompraArticuloController {

    private final ArticuloBaseDatosRepositorio articuloReposiorio = new ArticuloBaseDatosRepositorio();
    private final CompraBaseDeDatosRepositorio CompraArticuloReposiorio = new CompraBaseDeDatosRepositorio();
    private CompraArticulo CompraArticuloSeleccionada = new CompraArticulo();
    private final CompraArticuloView view;
    private final CompraController compraController;
    private final Compra compra;
    private CompraArticuloObserver observer = null;
    private ArrayList<Modelo> articulos = new ArrayList<>();

    public CompraArticuloController(CompraController compraController,
            CompraArticuloView view, Compra compra) throws Exception {
        this.view = view;
        this.compra = compra;
        this.compraController = compraController;
        observer = new CompraArticuloObserver(view);
    }

    public void cargar() throws SQLException, ClassNotFoundException, Exception {
        articulos = articuloReposiorio.ObtenerTodos();

        boolean esNuevaCompra = compra.Id == 0;

        if (!esNuevaCompra) {
            compra.setArticulos(CompraArticuloReposiorio.obtenerArticulos(compra.Id));
        }

        for (Modelo articulo : compra.getArticulos()) {
            articulo.addObserver(observer);
        }

        view.setViewMode(compra);
        view.cargar(compra.getArticulos(), articulos);
    }

    public void seleccionar(int id) {
        for (CompraArticulo compraArticulo : compra.getArticulos()) {
            if (compraArticulo.Id == id) {
                CompraArticuloSeleccionada = compraArticulo;
                CompraArticuloSeleccionada.setArticulo(compraArticulo.getArticulo());
                break;
            }
        }
    }

    public void eliminar() throws Exception {
        compra.getArticulos().remove(CompraArticuloSeleccionada);
        view.cargar(compra.getArticulos(), articulos);
        nuevo();
    }

    public void nuevo() {
        CompraArticuloSeleccionada = new CompraArticulo();
        CompraArticuloSeleccionada.addObserver(observer);
        CompraArticuloSeleccionada.setCantidad(0);
        CompraArticuloSeleccionada.setPrecio(0);
        calcularTotal();
    }

    public void guardar() throws Exception {
           view.mostrarError("Seguro que desea guardarlo?");
        compra.setFecha(Date.from(Instant.now()));
        CompraArticuloReposiorio.añadir(compra);
        compraController.cargar();
    }

    public void añadir(Articulo articulo, double cantidad, double precio) {
     
        CompraArticulo detalle = new CompraArticulo(getNextId(), articulo, cantidad, precio);
        compra.añadirArticulo(detalle);
        CompraArticuloSeleccionada = detalle;
        CompraArticuloSeleccionada.addObserver(observer);

        view.cargar(compra.getArticulos(), articulos);
        calcularTotal();
    }

    private void calcularTotal() {
        double total = 0;
        for (CompraArticulo detalle : compra.getArticulos()) {
            total += detalle.getCantidad() * detalle.getPrecio();
        }

        view.setTotal(total);
    }

    private int getNextId() {
        int nextId;
        var articulos = compra.getArticulos();

        if (!articulos.isEmpty()) {

            Modelo last = articulos.get(articulos.size() - 1);

            nextId = last.Id + 1;

        } else {

            nextId = 1;
        }

        return nextId;
    }
  

}
