package FitoControl.DataBase.baseDatosRepositorio;

import FitoControl.DataBase.modelo.*;

import java.sql.*;
import java.util.ArrayList;

/**
 * Clase que implementa la interfaz IBaseDatosRepositorio y proporciona
 * la funcionalidad para interactuar con la base de datos en relación a los artículos.
 */
public class ArticuloBaseDatosRepositorio implements IBaseDatosRepositorio {


    /**
     * Obtiene todos los registros de artículos de la base de datos.
     *
     * @return Lista de objetos Modelo que representan los artículos obtenidos.
     * @throws ClassNotFoundException Si no se encuentra la clase del controlador de la base de datos.
     * @throws SQLException           Si ocurre un error al ejecutar la consulta SQL.
     */
    @Override
    public ArrayList<Modelo> ObtenerTodos() throws ClassNotFoundException, SQLException {
         ArrayList<Modelo> articulos = new ArrayList<>();
        Connection conexion = BaseDatosConexion.obtener();
        String sql = " Select articulo.IdArticulo, articulo.Nombre as NombreArticulo, articulo.Cantidad,articulo.IdMedida, " +
                     " marca.idMarca, marca.nombre as NombreMarca  " +
                     " from articulo " +
                     " inner join marca on articulo.idMarca = marca.idMarca";

        Statement statement = conexion.createStatement();
        ResultSet resultado = statement.executeQuery(sql);

        while (resultado.next()) {
            Articulo ariculo = new Articulo(
                    resultado.getInt("IdArticulo"),
                    resultado.getString("NombreArticulo"),
                    TipoMedida.values()[resultado.getInt("IdMedida")],
                    new Marca(resultado.getInt("idMarca"), resultado.getString("NombreMarca")),
                    resultado.getDouble("Cantidad"));

            articulos.add(ariculo);
        }

        return articulos;
    }


    /**
     * Agrega un nuevo registro de artículo a la base de datos.
     *
     * @param modelo Objeto Modelo que representa el artículo a añadir.
     * @return El objeto Modelo añadido.
     * @throws Exception Si ocurre un error durante la operación.
     */

    @Override
    public Modelo añadir(Modelo modelo) throws Exception {
        Articulo articulo = (Articulo) modelo;
        Connection conexion = BaseDatosConexion.obtener();
        String sql = "INSERT INTO Articulo (  Nombre,IdMedida,IdMArca, Cantidad )"
                + "VALUES (?, ?, ?, ?)";
        PreparedStatement statement = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, articulo.getNombre());
        statement.setInt(2, articulo.getTipoMedida().ordinal());
        statement.setInt(3, articulo.getIdMarca());
        statement.setDouble(4, articulo.getCantidad());

        statement.executeUpdate();

        //Funcion utilizada para obtener el id autogenerado en base de datos y se asigna al id del articulo
        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                articulo.Id = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Error al obtener el id del articulo.");
            }
        }

        return modelo;
    }


    /**
     * Actualiza un registro de artículo en la base de datos.
     *
     * @param modelo Objeto Modelo que representa el artículo a actualizar.
     * @throws SQLException           Si ocurre un error al ejecutar la consulta SQL.
     * @throws ClassNotFoundException Si no se encuentra la clase del controlador de la base de datos.
     */

    @Override
    public void actualizar(Modelo modelo) throws SQLException, ClassNotFoundException {
        Articulo articulo = (Articulo) modelo;
        Connection conexion = BaseDatosConexion.obtener();
        String sql = "UPDATE articulo SET  Nombre=?, idmedida=?,idmarca=? WHERE IdArticulo=?";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, articulo.getNombre());
        statement.setInt(2, articulo.getTipoMedida().ordinal());
        statement.setInt(3, articulo.getIdMarca());
        statement.setInt(4, articulo.Id);
        statement.executeUpdate();
    }

    /**
     * Elimina un registro de artículo de la base de datos.
     *
     * @param modelo Objeto Modelo que representa el artículo a eliminar.
     * @throws SQLException           Si ocurre un error al ejecutar la consulta SQL.
     * @throws ClassNotFoundException Si no se encuentra la clase del controlador de la base de datos.
     */
    @Override
    public void eliminar(Modelo modelo) throws SQLException, ClassNotFoundException {
        Connection conexion = BaseDatosConexion.obtener();
        String sql = "DELETE FROM articulo WHERE IdArticulo = ?";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setInt(1, modelo.Id);
        statement.executeUpdate();
    }
    /**
     * Actualiza la cantidad de una lista de artículos en la base de datos.
     *
     * @param articulos La lista de artículos a actualizar.
     * @throws SQLException           Si ocurre un error al ejecutar la consulta SQL.
     * @throws ClassNotFoundException Si no se encuentra la clase del controlador de la base de datos.
     */
    public void actualizar(ArrayList<Articulo> articulos) throws SQLException, ClassNotFoundException {
        Connection conexion = BaseDatosConexion.obtener();

        for (Articulo articulo : articulos) {
            String sql = "UPDATE Articulo SET Cantidad = ? WHERE IdArticulo = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setDouble(1, articulo.getCantidad());
            statement.setInt(2, articulo.Id);
            statement.executeUpdate();
        }
    }
}