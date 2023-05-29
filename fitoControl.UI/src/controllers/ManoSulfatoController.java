package controllers;

import FitoControl.DataBase.baseDatosRepositorio.ManoSulfatoBaseDeDatosRepositorio;
import FitoControl.DataBase.modelo.ManoSulfato;
import FitoControl.DataBase.modelo.Modelo;
import java.sql.SQLException;
import java.util.ArrayList;
import view.ManoSulfatoArticuloView;
import view.ManoSulfatoView;

public class ManoSulfatoController {

    private final ManoSulfatoBaseDeDatosRepositorio manoSulfatoReposiorio = new ManoSulfatoBaseDeDatosRepositorio();
    private final ManoSulfatoView view;
    private ArrayList<Modelo> manosSulfato = new ArrayList<>();
    private ManoSulfato manoSulfatoSeleccionada = new ManoSulfato();

    public ManoSulfatoController(ManoSulfatoView view) {
        this.view = view;

    }

    public void cargar() throws SQLException, ClassNotFoundException {
        manosSulfato = manoSulfatoReposiorio.ObtenerTodos();
        view.cargar(manosSulfato);
    }

    public void seleccionar(int id) throws SQLException, ClassNotFoundException, Exception {
        for (Modelo modelo : manosSulfato) {
            if (modelo.Id == id) {
                ManoSulfato manoSulfato = (ManoSulfato) modelo;
                manoSulfatoSeleccionada = manoSulfato;
                manoSulfatoSeleccionada.setFecha(manoSulfato.getFecha());
                break;
            }
        }
        abrirArticulosView();
    }

    public void nuevo() throws SQLException, ClassNotFoundException, Exception {
        manoSulfatoSeleccionada = new ManoSulfato();
        manoSulfatoSeleccionada.setFecha(null);
        abrirArticulosView();
    }

    public void eliminar() throws Exception {
        manoSulfatoReposiorio.eliminar(manoSulfatoSeleccionada);
    }

    private void abrirArticulosView() throws SQLException, ClassNotFoundException, Exception {
        ManoSulfatoArticuloView manoSulfato = new ManoSulfatoArticuloView(this,manoSulfatoSeleccionada);
        manoSulfato.setVisible(true);
    }

}
