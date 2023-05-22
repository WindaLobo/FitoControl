package controllers;

import FitoControl.DataBase.BaseDatosRepositorio.CompraBaseDeDatosRepositorio;
import FitoControl.DataBase.modelo.Compra;
import FitoControl.DataBase.modelo.Modelo;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public void seleccionar(int id) {
        for (Modelo modelo : compras) {
            if (modelo.Id == id) {
                Compra compra = (Compra) modelo;
                compraSeleccionada = compra;
                compraSeleccionada.setFecha(compra.getFecha());
                break;
            }
        }
    }

    public void nuevo() {
        compraSeleccionada = new Compra();
        compraSeleccionada.setFecha(null);

    }

    public void eliminar() throws Exception {
        compraReposiorio.eliminar(compraSeleccionada);
        nuevo();
    }

}
