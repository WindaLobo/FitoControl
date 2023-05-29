package FitoControl.DataBase.baseDatosRepositorio;

import FitoControl.DataBase.modelo.Marca;
import FitoControl.DataBase.modelo.Modelo;

import java.sql.*;
import java.util.ArrayList;

/**
 * Esta clase implementa la interfaz IBaseDatosRepositorio y proporciona
 * métodos para acceder y manipular los datos de la tabla Marca en la base de datos.
 */
public class MarcaBaseDatosRepositorio implements IBaseDatosRepositorio {
    /**
     * Obtiene todos los registros de la tabla Marca de la base de datos.
     *
     * @return una lista de objetos Modelo que representan los registros de Marca.
     * @throws SQLException           si ocurre algún error al interactuar con la base de datos.
     * @throws ClassNotFoundException si no se encuentra la clase para la conexión a la base de datos.
     */

    @Override
    public ArrayList<Modelo> ObtenerTodos() throws SQLException, ClassNotFoundException {
        ArrayList<Modelo> marcas = new ArrayList<>();
        Connection conexion = BaseDatosConexion.obtener();
        String sql = " Select IdMarca, Nombre from marca   ";
        Statement statement = conexion.createStatement();
        ResultSet resultado = statement.executeQuery(sql);

        while (resultado.next()) {
            Marca marca = new Marca(
                    resultado.getInt("IdMarca"),
                    resultado.getString("Nombre"));
            marcas.add(marca);
        }

        return marcas;
    }


    /**
     * Añade un registro de Marca a la base de datos.
     *
     * @param modelo el objeto Modelo que se va a añadir.
     * @return el objeto Modelo añadido.
     * @throws Exception              si ocurre algún error al interactuar con la base de datos.
     * @throws SQLException           si ocurre algún error al ejecutar las consultas SQL.
     * @throws ClassNotFoundException si no se encuentra la clase para la conexión a la base de datos.
     */
    @Override
    public Modelo añadir(Modelo modelo) throws Exception {
        Marca marca = (Marca) modelo;
        Connection conexion = BaseDatosConexion.obtener();
        String sql = "INSERT INTO Marca (Nombre)" + "VALUES (?)";
        PreparedStatement statement = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, marca.getNombre());
        statement.executeUpdate();

        //Funcion utilizada para obtener el id autogenerado en base de datos y se asigna al id del marca
        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                marca.Id = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Error al obtener el id del marca.");
            }
        }

        return modelo;
    }

    /**
     * Actualiza un registro de Marca en la base de datos.
     *
     * @param modelo el objeto Modelo que se va a actualizar.
     * @throws SQLException           si ocurre algún error al interactuar con la base de datos.
     * @throws ClassNotFoundException si no se encuentra la clase para la conexión a la base de datos.
     */

    @Override
    public void actualizar(Modelo modelo) throws SQLException, ClassNotFoundException {
        Marca marca = (Marca) modelo;
        Connection conexion = BaseDatosConexion.obtener();
        String sql = "UPDATE marca SET  Nombre=? WHERE IdMarca=?";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, marca.getNombre());
        statement.setInt(2, marca.Id);
        statement.executeUpdate();

    }

    /**
     * Elimina un registro de Marca de la base de datos.
     *
     * @param modelo el objeto Modelo que se va a eliminar.
     * @throws SQLException           si ocurre algún error al interactuar con la base de datos.
     * @throws ClassNotFoundException si no se encuentra la clase para la conexión a la base de datos.
     */
    @Override
    public void eliminar(Modelo modelo) throws SQLException, ClassNotFoundException {
        Connection conexion = BaseDatosConexion.obtener();
        String sql = "DELETE FROM marca WHERE IdMarca=?";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setInt(1, modelo.Id);
        statement.executeUpdate();
    }
}
