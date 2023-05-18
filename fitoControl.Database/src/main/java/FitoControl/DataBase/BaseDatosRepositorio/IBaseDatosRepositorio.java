package FitoControl.DataBase.BaseDatosRepositorio;

import FitoControl.DataBase.modelo.Modelo;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IBaseDatosRepositorio {

    public ArrayList<Modelo> ObtenerTodos() throws SQLException, ClassNotFoundException;

    public Modelo añadir(Modelo modelo) throws Exception;
    public void actualizar(Modelo modelo)throws SQLException, ClassNotFoundException;
    public void eliminar(Modelo modelo)throws SQLException, ClassNotFoundException;
}
