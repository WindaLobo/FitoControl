package controllers;

import FitoControl.DataBase.baseDatosRepositorio.MarcaBaseDatosRepositorio;
import FitoControl.DataBase.modelo.Marca;
import FitoControl.DataBase.modelo.Modelo;
import java.sql.SQLException;
import java.util.ArrayList;
import observers.MarcaObserver;
import view.MarcaView;

public class MarcaController {

    private final MarcaBaseDatosRepositorio marcaReposiorio = new MarcaBaseDatosRepositorio();
    private final MarcaView view;
    private ArrayList<Modelo> marcas = new ArrayList<>();
    private Marca marcaSeleccionada = new Marca();
    private MarcaObserver observer = null;

    public MarcaController(MarcaView view) throws SQLException, ClassNotFoundException {
        this.view = view;
        observer = new MarcaObserver(view);
        
    }

    public void cargar() throws SQLException, ClassNotFoundException {
        marcas = marcaReposiorio.ObtenerTodos();

        for (Modelo marca : marcas) {
            marca.addObserver(observer);
        }

        view.cargar(marcas);
    }

    public void seleccionar(int id) {
        for (Modelo modelo : marcas) {
            if (modelo.Id == id) {
                Marca marca = (Marca) modelo;
                marcaSeleccionada = marca;
                marcaSeleccionada.setNombre(marca.getNombre());
                break;
            }
        }
    }

    public void guardarActualizar(String nombre) throws Exception {

        marcaSeleccionada.setNombre(nombre);

        if (marcaSeleccionada.Id == 0) {
            marcaSeleccionada = (Marca) marcaReposiorio.añadir(marcaSeleccionada);
        } else {
            marcaReposiorio.actualizar(marcaSeleccionada);
        }
    }

    public void nuevo() {
        marcaSeleccionada = new Marca();
        marcaSeleccionada.addObserver(observer);
        marcaSeleccionada.setNombre("");
    }

    public void eliminar() throws Exception {
        marcaReposiorio.eliminar(marcaSeleccionada);
        nuevo();
    }
}
