package FitoControl.DataBase.baseDatosRepositorio;

import FitoControl.DataBase.modelo.Modelo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Esta interfaz define los métodos para acceder a la base de datos del repositorio.
 */
public interface IBaseDatosRepositorio {
    /**
     * Obtiene todos los registros del repositorio.
     *
     * @return Una lista de objetos Modelo con todos los registros.
     * @throws SQLException           Si ocurre un error al ejecutar la consulta SQL.
     * @throws ClassNotFoundException Si no se encuentra la clase del controlador de la base de datos.
     */

    public ArrayList<Modelo> ObtenerTodos() throws SQLException, ClassNotFoundException;

    /**
     * Añade un nuevo registro al repositorio.
     *
     * @param modelo Objeto Modelo a añadir.
     * @return El objeto Modelo añadido.
     * @throws Exception Si ocurre un error durante la operación.
     */


    public Modelo añadir(Modelo modelo) throws Exception;

    /**
     * Actualiza un registro existente en el repositorio.
     *
     * @param modelo Objeto Modelo a actualizar.
     * @throws SQLException           Si ocurre un error al ejecutar la consulta SQL.
     * @throws ClassNotFoundException Si no se encuentra la clase del controlador de la base de datos.
     */
    public void actualizar(Modelo modelo) throws SQLException, ClassNotFoundException;

    /**
     * Elimina un registro del repositorio.
     *
     * @param modelo Objeto Modelo a eliminar.
     * @throws SQLException           Si ocurre un error al ejecutar la consulta SQL.
     * @throws ClassNotFoundException Si no se encuentra la clase del controlador de la base de datos.
     */
    public void eliminar(Modelo modelo) throws SQLException, ClassNotFoundException;
}
