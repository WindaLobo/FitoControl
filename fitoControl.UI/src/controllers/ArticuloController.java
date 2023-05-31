package controllers;

import FitoControl.DataBase.baseDatosRepositorio.ArticuloBaseDatosRepositorio;
import FitoControl.DataBase.baseDatosRepositorio.MarcaBaseDatosRepositorio;
import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.Marca;
import FitoControl.DataBase.modelo.Modelo;
import FitoControl.DataBase.modelo.TipoMedida;
import java.sql.SQLException;
import java.util.ArrayList;
import observers.ArticuloObserver;
import view.ArticuloView;

public class ArticuloController {

    private final MarcaBaseDatosRepositorio marcaReposiorio = new MarcaBaseDatosRepositorio();
    private final ArticuloBaseDatosRepositorio articuloReposiorio = new ArticuloBaseDatosRepositorio();
    private final ArticuloView view;
    private ArrayList<Modelo> articulos = new ArrayList<>();
    private ArrayList<Modelo> marcas = new ArrayList<>();
    private Articulo articuloSeleccionada = new Articulo();
    private ArticuloObserver observer = null;

    public ArticuloController(ArticuloView view) {

        this.view = view;
        observer = new ArticuloObserver(view);

    }

    public void cargar() throws ClassNotFoundException, SQLException {
        articulos = articuloReposiorio.ObtenerTodos();
        marcas = marcaReposiorio.ObtenerTodos();

        for (Modelo articulo : articulos) {
            articulo.addObserver(observer);
        }

        view.cargar(articulos, marcas);
    }

    public void guardarActualizar(String nombre, TipoMedida tipoDeMedida, Marca marca) throws Exception {

        articuloSeleccionada.setNombre(nombre);
        articuloSeleccionada.setTipoMedida(tipoDeMedida);
        articuloSeleccionada.setIdMarca(marca.Id);
        articuloSeleccionada.setMarca(marca);

        if (articuloSeleccionada.Id == 0) {
            articuloSeleccionada = (Articulo) articuloReposiorio.añadir(articuloSeleccionada);
        } else {
            articuloReposiorio.actualizar(articuloSeleccionada);
        }
    }

    public void nuevo() {
        articuloSeleccionada = new Articulo();
        articuloSeleccionada.addObserver(observer);
        articuloSeleccionada.setNombre("");

    }

    public void seleccionar(int id) {
        for (Modelo modelo : articulos) {
            if (modelo.Id == id) {
                Articulo articulo = (Articulo) modelo;
                articuloSeleccionada = articulo;
                articuloSeleccionada.setMarca(articulo.getMarca());
                break;
            }
        }
    }

    public void eliminar() throws Exception {
        articuloReposiorio.eliminar(articuloSeleccionada);
        nuevo();
    }

    public void buscarArticuloPorNombre(String busqueda) {
        ArrayList<Modelo> articulosEncontrados = new ArrayList<>();

        if (busqueda == "") {
            view.cargar(articulos, marcas);
            return;
        }

        for (Modelo modelo : articulos) {
            Articulo articulo = (Articulo) modelo;
            if (articulo.getNombre().toLowerCase().contains(busqueda.toLowerCase()) || 
                articulo.getMarca().getNombre().toLowerCase().contains(busqueda.toLowerCase())) {
                articulosEncontrados.add(articulo);
            }
        }

        view.cargar(articulosEncontrados, marcas);
    }

}