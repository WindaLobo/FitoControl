package controllers;

import FitoControl.DataBase.BaseDatosRepositorio.ArticuloBaseDatosRepositorio;
import FitoControl.DataBase.BaseDatosRepositorio.ManoSulfatoBaseDeDatosRepositorio;
import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.ManoSulfato;
import FitoControl.DataBase.modelo.ManoSulfatoArticulo;
import FitoControl.DataBase.modelo.Modelo;
import FitoControl.DataBase.modelo.TipoMedida;
import java.sql.SQLException;
import java.util.ArrayList;
import observers.ManoSulfatoArticuloObserver;
import view.ManoSulfatoArticuloView;

public class ManoSulfatoArticuloController {

    private final ArticuloBaseDatosRepositorio articuloReposiorio = new ArticuloBaseDatosRepositorio();
    private final ManoSulfatoBaseDeDatosRepositorio manoSulfatoReposiorio = new ManoSulfatoBaseDeDatosRepositorio();
    private final ManoSulfatoArticuloView view;
    private final ManoSulfato manoSulfato;
    private ArrayList<Modelo> manosSulfatoArticulo = new ArrayList<>();
    private ArrayList<Modelo> articulos = new ArrayList<>();
    private ManoSulfatoArticulo manoSulfatoSeleccionada = new ManoSulfatoArticulo();
    private ManoSulfatoArticuloObserver observer = null;

    public ManoSulfatoArticuloController(ManoSulfatoArticuloView view, ManoSulfato manoSulfato) {
        this.view = view;
        this.manoSulfato = manoSulfato;

        observer = new ManoSulfatoArticuloObserver(view);
        view.setViewMode(manoSulfato);

    }

    public void cargar() throws SQLException, ClassNotFoundException {
        manosSulfatoArticulo = manoSulfatoReposiorio.ObtenerArticulos(manoSulfato.Id);
        articulos = articuloReposiorio.ObtenerTodos();
        view.cargar(manosSulfatoArticulo, articulos);

    }

    public void seleccionar(int id) {
        for (Modelo modelo : manosSulfatoArticulo) {
            if (modelo.Id == id) {
                ManoSulfatoArticulo manoSulfatoarticulo = (ManoSulfatoArticulo) modelo;
                manoSulfatoSeleccionada = manoSulfatoarticulo;
                manoSulfatoSeleccionada.setArticulo(manoSulfatoarticulo.getArticulo());
                break;
            }
        }
    }
      public void nuevo()  {
         manoSulfatoSeleccionada = new ManoSulfatoArticulo();
        manoSulfatoSeleccionada.addObserver(observer);
        manoSulfatoSeleccionada.setCantidad(0);
        manoSulfatoSeleccionada.setArticulo(new Articulo());
        manoSulfatoSeleccionada.setIdMedida(null);
       
     
       
      
    }
      public void guardarActualizar(Double cantidad, TipoMedida tipoDeMedida, Articulo articulo) throws SQLException, Exception{

        manoSulfatoSeleccionada.setCantidad(0);
        manoSulfatoSeleccionada.getIdManoSulfato();
        manoSulfatoSeleccionada.getIdMedida();
        
        

        if (manoSulfatoSeleccionada.Id == 0) {
            manoSulfatoSeleccionada = (ManoSulfatoArticulo) manoSulfatoReposiorio.añadir(manoSulfatoSeleccionada);
        } else {
            manoSulfatoReposiorio.actualizar(manoSulfatoSeleccionada);
        }
    }

   

}
