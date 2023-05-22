package FitoControl.DataBase.BaseDatosRepositorio;

import FitoControl.DataBase.modelo.*;

import java.sql.*;
import java.time.Instant;
import java.util.ArrayList;

/**
 * Esta clase implementa la interfaz IBaseDatosRepositorio y proporciona
 * métodos para acceder y manipular los datos de la tabla ManoSulfato en la base de datos.
 */
public class ManoSulfatoBaseDeDatosRepositorio implements IBaseDatosRepositorio {

    /**
     * Obtiene todos los registros de la tabla ManoSulfato de la base de datos.
     *
     * @return una lista de objetos Modelo que representan los registros de ManoSulfato.
     * @throws SQLException           si ocurre algún error al interactuar con la base de datos.
     * @throws ClassNotFoundException si no se encuentra la clase para la conexión a la base de datos.
     */
    @Override
    public ArrayList<Modelo> ObtenerTodos() throws SQLException, ClassNotFoundException {
        ArrayList<Modelo> ManosSulfato = new ArrayList<>();
        Connection conexion = BaseDatosConexion.obtener();
        String sql = " Select IdManoSulfato, fecha from ManoSulfato";
        Statement statement = conexion.createStatement();
        ResultSet resultado = statement.executeQuery(sql);

        while (resultado.next()) {
            ManoSulfato manoSulfato = new ManoSulfato(
                    resultado.getInt("IdManoSulfato"),
                    resultado.getTimestamp("Fecha"));

            ManosSulfato.add(manoSulfato);
        }
        conexion.close();
        return ManosSulfato;
    }

    /**
     * Añade un registro de ManoSulfato a la base de datos.
     *
     * @param modelo el objeto Modelo que se va a añadir.
     * @return el objeto Modelo añadido.
     * @throws Exception              si ocurre algún error al interactuar con la base de datos.
     * @throws SQLException           si ocurre algún error al ejecutar las consultas SQL.
     * @throws ClassNotFoundException si no se encuentra la clase para la conexión a la base de datos.
     */

    @Override
    public Modelo añadir(Modelo modelo) throws Exception {

        Connection conexion = BaseDatosConexion.obtener();

        //ManoSulfato
        ManoSulfato manoSulfato = (ManoSulfato) modelo;
        String sql1 = "INSERT INTO manoSulfato (fecha)"
                + "VALUES (?)";
        PreparedStatement statement1 = conexion.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
        statement1.setDate(1, new java.sql.Date(manoSulfato.getFecha().getTime()));
        statement1.executeUpdate();

        //Funcion utilizada para obtener el id autogenerado en base de datos y se asigna al id del articulo
        try (ResultSet generatedKeys = statement1.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                manoSulfato.Id = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Error al obtener el id de la manoSulfato");
            }
        }

        //ManoSulfatoArticulo
        for (ManoSulfatoArticulo articulo : manoSulfato.getArticulos()) {
            String sql2 = "INSERT INTO ManoSulfatoArticulo (IdManosulfato, Idarticulo,idMedida,cantidad)" + "VALUES (?,?,?,?)";

            PreparedStatement statement2 = conexion.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
            statement2.setInt(1, manoSulfato.Id);
            statement2.setInt(2, articulo.getIdArticulo());
            statement2.setInt(3, articulo.getIdMedida().ordinal());
            statement2.setDouble(4, articulo.getCantidad());
            statement2.executeUpdate();

            try (ResultSet generatedKeys = statement2.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    articulo.Id = generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Error al obtener el id de la manosulfato");
                }
            }
        }
        conexion.close();
        return modelo;
    }

    @Override
    public void actualizar(Modelo modelo) throws SQLException, ClassNotFoundException {
        //TODO: Next version
    }

    /**
     * Elimina un registro de ManoSulfato de la base de datos.
     *
     * @param modelo el objeto Modelo que se va a eliminar.
     * @throws SQLException           si ocurre algún error al interactuar con la base de datos.
     * @throws ClassNotFoundException si no se encuentra la clase para la conexión a la base de datos.
     */

    @Override
    public void eliminar(Modelo modelo) throws SQLException, ClassNotFoundException {
        Connection conexion = BaseDatosConexion.obtener();

        // Eliminar los CompraArticulo asociados a la Compra
        String sql1 = "DELETE FROM ManoSulfatoArticulo WHERE IdManosulfato = ?";
        PreparedStatement statement1 = conexion.prepareStatement(sql1);
        statement1.setInt(1, modelo.Id);
        statement1.executeUpdate();

        // Eliminar la Compra
        String sql2 = "DELETE FROM manoSulfato WHERE IdManosulfato = ?";
        PreparedStatement statement2 = conexion.prepareStatement(sql2);
        statement2.setInt(1, modelo.Id);
        statement2.executeUpdate();
        conexion.close();

    }
}
