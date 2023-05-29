package controllers;

import FitoControl.DataBase.baseDatosRepositorio.CompraBaseDeDatosRepositorio;
import FitoControl.DataBase.modelo.Compra;
import FitoControl.DataBase.modelo.Modelo;
import java.sql.SQLException;
import java.util.ArrayList;
import view.CompraArticuloView;
import view.CompraView;

public class CompraController {

    private final CompraBaseDeDatosRepositorio compraReposiorio = new CompraBaseDeDatosRepositorio();
    private final CompraView view;
    private ArrayList<Modelo> compras = new ArrayList<>();
    private Compra compraSeleccionada = new Compra();

    public CompraController(CompraView view) {
        this.view = view;

    }

    public void cargar() throws SQLException, ClassNotFoundException {
        compras = compraReposiorio.ObtenerTodos();
        view.cargar(compras);
    }

    public void seleccionar(int id) throws SQLException, ClassNotFoundException, Exception {
        for (Modelo modelo : compras) {
            if (modelo.Id == id) {
                Compra compra = (Compra) modelo;
                compraSeleccionada = compra;
                compraSeleccionada.setFecha(compra.getFecha());
                break;
            }
        }

        abrirArticulosView();
    }

    public void nuevo() throws SQLException, ClassNotFoundException, Exception {
        compraSeleccionada = new Compra();
        compraSeleccionada.setFecha(null);
        abrirArticulosView();
    }

    public void eliminar() throws Exception {
        compraReposiorio.eliminar(compraSeleccionada);
    }
   

    private void abrirArticulosView() throws SQLException, ClassNotFoundException, Exception {
        CompraArticuloView compraArticulo = new CompraArticuloView(this,compraSeleccionada);
        compraArticulo.setVisible(true);
    }

}
