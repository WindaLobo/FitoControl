package FitoControl.DataBase.BaseDatosRepositorio;

import FitoControl.DataBase.modelo.Modelo;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IBaseDatosRepositorio {

    public ArrayList<Modelo> ObtenerTodos() throws SQLException, ClassNotFoundException;

    public Modelo Añadir(Modelo modelo) throws Exception;

}
