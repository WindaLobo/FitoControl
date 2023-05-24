package FitoControl.DataBase.BaseDatosRepositorio;

import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.Compra;
import FitoControl.DataBase.modelo.CompraArticulo;
import FitoControl.DataBase.modelo.Modelo;

import java.sql.*;
import java.util.ArrayList;

/**
 * Esta clase implementa la interfaz IBaseDatosRepositorio y proporciona
 * métodos para acceder y manipular los datos de la tabla Compra en la base de datos.
 */

public class CompraBaseDeDatosRepositorio implements IBaseDatosRepositorio {

    /**
     * Obtiene todos los registros de la tabla Compra de la base de datos.
     *
     * @return una lista de objetos Modelo que representan los registros de Compra.
     * @throws SQLException           si ocurre algún error al interactuar con la base de datos.
     * @throws ClassNotFoundException si no se encuentra la clase para la conexión a la base de datos.
     */

    @Override
    public ArrayList<Modelo> ObtenerTodos() throws SQLException, ClassNotFoundException {
       ArrayList<Modelo> Compras = new ArrayList<>();
        Connection conexion = BaseDatosConexion.obtener();
        String sql = " Select IdCompra, fecha from compra";
        Statement statement = conexion.createStatement();
        ResultSet resultado = statement.executeQuery(sql);

        while (resultado.next()) {
            Compra compra = new Compra(
                    resultado.getInt("IdCompra"),
                    resultado.getTimestamp("Fecha"));

            Compras.add(compra);
        }
        conexion.close();
        return Compras;
    }

    /**
     * Añade un registro de Compra a la base de datos.
     *
     * @param modelo el objeto Modelo que se va a añadir.
     * @return el objeto Modelo añadido.
     * @throws Exception              si ocurre algún error al interactuar con la base de datos.
     * @throws SQLException           si ocurre algún error al ejecutar las consultas SQL.
     * @throws ClassNotFoundException si no se encuentra la clase para la conexión a la base de datos.
     */
    @Override
    public Modelo añadir(Modelo modelo) throws Exception {
        Compra compra = (Compra) modelo;
        Connection conexion = BaseDatosConexion.obtener();

        String sql1 = "INSERT INTO Compra (fecha)"
                + "VALUES (?)";
        PreparedStatement statement1 = conexion.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
        statement1.setDate(1, new java.sql.Date(compra.getFecha().getTime()));
        statement1.executeUpdate();
        //Funcion utilizada para obtener el id autogenerado en base de datos y se asigna al id del articulo
        try (ResultSet generatedKeys = statement1.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                compra.Id = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Error al obtener el id de la compra");
            }
        }

        //CompraArticulo
        for (CompraArticulo articulo : compra.getArticulos()) {
            String sql2 = "INSERT INTO CompraArticulo (IdCompra, IdArticulo, cantidad, precio)" + "VALUES (?,?,?,?)";

            PreparedStatement statement2 = conexion.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
            statement2.setInt(1, compra.Id);
            statement2.setInt(2, articulo.getIdArticulo());
            statement2.setDouble(3, articulo.getCantidad());
            statement2.setDouble(4, articulo.getPrecio());
            statement2.executeUpdate();

            try (ResultSet generatedKeys = statement2.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    articulo.Id = generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Error al obtener el id de la compra");
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
     * Elimina un registro de Compra de la base de datos.
     *
     * @param modelo el objeto Modelo que se va a eliminar.
     * @throws SQLException           si ocurre algún error al interactuar con la base de datos.
     * @throws ClassNotFoundException si no se encuentra la clase para la conexión a la base de datos.
     */

    @Override
    public void eliminar(Modelo modelo) throws SQLException, ClassNotFoundException {
        Connection conexion = BaseDatosConexion.obtener();

        // Eliminar los CompraArticulo asociados a la Compra
        String sql1 = "DELETE FROM CompraArticulo WHERE IdCompra = ?";
        PreparedStatement statement1 = conexion.prepareStatement(sql1);
        statement1.setInt(1, modelo.Id);
        statement1.executeUpdate();

        // Eliminar la Compra
        String sql2 = "DELETE FROM Compra WHERE IdCompra = ?";
        PreparedStatement statement2 = conexion.prepareStatement(sql2);
        statement2.setInt(1, modelo.Id);
        statement2.executeUpdate();
        conexion.close();
    }

    public ArrayList<Modelo> ObtenerArticulos(int idCompra) throws SQLException, ClassNotFoundException {
        ArrayList<Modelo> compraArticulos = new ArrayList<>();

        Connection conexion = BaseDatosConexion.obtener();
        String sql = "SELECT IdCompraArticulo, IdCompra, Articulo.IdArticulo, " +
                "       Articulo.Nombre, CompraArticulo.Cantidad, Precio " +
                " FROM CompraArticulo " +
                " INNER JOIN Articulo ON CompraArticulo.IdArticulo = Articulo.IdArticulo " +
                " WHERE IdCompra = " + idCompra;

        Statement statement = conexion.createStatement();
        ResultSet resultado = statement.executeQuery(sql);

        while (resultado.next()) {
            Articulo articulo = new Articulo(resultado.getInt("IdArticulo"), resultado.getString("Nombre"));

            CompraArticulo compraArticulo = new CompraArticulo(resultado.getInt("IdCompraArticulo"),
                    resultado.getInt("IdCompra"),
                    articulo,
                    resultado.getInt("Cantidad"),
                    resultado.getDouble("Precio"));

            compraArticulos.add(compraArticulo);
        }

        conexion.close();
        return compraArticulos;
    }

}

