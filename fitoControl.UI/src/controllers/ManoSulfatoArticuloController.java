
package controllers;

import FitoControl.DataBase.BaseDatosRepositorio.ManoSulfatoBaseDeDatosRepositorio;
import FitoControl.DataBase.modelo.ManoSulfato;
import FitoControl.DataBase.modelo.Modelo;
import java.sql.SQLException;
import java.util.ArrayList;
import view.ManoSulfatoArticuloView;
import view.ManoSulfatoView;

public class ManoSulfatoArticuloController {
     private final ManoSulfatoBaseDeDatosRepositorio manoSulfatoReposiorio = new ManoSulfatoBaseDeDatosRepositorio();
    private final ManoSulfatoArticuloView view;
    private ArrayList<Modelo> manosSulfato = new ArrayList<>();
    private ManoSulfato manoSulfatoSeleccionada = new ManoSulfato();

    public ManoSulfatoArticuloController(ManoSulfatoArticuloView view) {
        this.view = view;

    }

    public void cargar() throws SQLException, ClassNotFoundException {
        manosSulfato = manoSulfatoReposiorio.ObtenerTodos();
        view.cargar(manosSulfato);
    }

    public void seleccionar(int id) {
        for (Modelo modelo : manosSulfato) {
            if (modelo.Id == id) {
                ManoSulfato manoSulfato = (ManoSulfato) modelo;
                manoSulfatoSeleccionada = manoSulfato;
                manoSulfatoSeleccionada.setFecha(manoSulfato.getFecha());
                break;
            }
        }
    }
    
}
