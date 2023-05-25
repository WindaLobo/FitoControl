package controllers;

import FitoControl.DataBase.BaseDatosRepositorio.ManoSulfatoBaseDeDatosRepositorio;
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

    public void seleccionar(int id) throws SQLException, ClassNotFoundException {
        for (Modelo modelo : manosSulfato) {
            if (modelo.Id == id) {
                ManoSulfato manoSulfato = (ManoSulfato) modelo;
                manoSulfatoSeleccionada = manoSulfato;
                manoSulfatoSeleccionada.setFecha(manoSulfato.getFecha());
                break;
            }
        }
        AbrirArticulosView();
    }

    public void nuevo() throws SQLException, ClassNotFoundException {
        manoSulfatoSeleccionada = new ManoSulfato();
        manoSulfatoSeleccionada.setFecha(null);
        AbrirArticulosView();

    }

    public void eliminar() throws Exception {
        manoSulfatoReposiorio.eliminar(manoSulfatoSeleccionada);
        nuevo();
    }

    private void AbrirArticulosView() throws SQLException, ClassNotFoundException {
        ManoSulfatoArticuloView manoSulfato = new ManoSulfatoArticuloView(manoSulfatoSeleccionada);
        manoSulfato.setVisible(true);
    }

}
