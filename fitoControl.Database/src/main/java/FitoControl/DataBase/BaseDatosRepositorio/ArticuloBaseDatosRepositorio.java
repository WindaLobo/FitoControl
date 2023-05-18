package FitoControl.DataBase.BaseDatosRepositorio;

import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.Modelo;
import FitoControl.DataBase.modelo.TipoMedida;

import java.sql.*;
import java.util.ArrayList;

public class ArticuloBaseDatosRepositorio implements IBaseDatosRepositorio {
    private static final ArrayList<Modelo> Articulos = new ArrayList<>();

    @Override
    public ArrayList<Modelo> ObtenerTodos() throws ClassNotFoundException, SQLException {
        Connection conexion = BaseDatosConexion.obtener();
        String sql = " Select IdArticulo, Nombre, Cantidad,IdMArca,IdMedida from articulo";
        Statement statement = conexion.createStatement();
        ResultSet resultado = statement.executeQuery(sql);

        while (resultado.next()) {
            Articulo ariculo = new Articulo(
                    resultado.getInt("IdArticulo"),
                    resultado.getString("Nombre"),
                    TipoMedida.values()[resultado.getInt("IdMedida")],
                    resultado.getInt("IdMArca"),
                    resultado.getDouble("Cantidad"));

            Articulos.add(ariculo);
        }

        conexion.close();
        return Articulos;
    }

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
        conexion.close();

        return modelo;
    }

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
        conexion.close();
    }
    @Override
    public void eliminar(Modelo modelo) throws SQLException, ClassNotFoundException {
        Connection conexion = BaseDatosConexion.obtener();
        String sql = "DELETE FROM articulo WHERE IdArticulo = ?";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setInt(1, modelo.Id);
        statement.executeUpdate();
        conexion.close();
    }
}
