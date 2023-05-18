package FitoControl.DataBase.BaseDatosRepositorio;

import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.Marca;
import FitoControl.DataBase.modelo.Modelo;
import FitoControl.DataBase.modelo.TipoMedida;

import java.sql.*;
import java.util.ArrayList;

public class MarcaBaseDatosRepositorio implements IBaseDatosRepositorio {
    private final ArrayList<Modelo> Marcas = new ArrayList<>();

    @Override
    public ArrayList<Modelo> ObtenerTodos() throws SQLException, ClassNotFoundException {
        Connection conexion = BaseDatosConexion.obtener();
        String sql = " Select IdMarca, Nombre from marca";
        Statement statement = conexion.createStatement();
        ResultSet resultado = statement.executeQuery(sql);

        while (resultado.next()) {
            Marca marcas = new Marca(
                    resultado.getInt("IdMarca"),
                    resultado.getString("Nombre"));
            Marcas.add(marcas);
        }
        conexion.close();
        return Marcas;
    }


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
                throw new SQLException("Error al obtener el id del articulo.");
            }
        }
        conexion.close();
        return modelo;
    }

    @Override
    public void actualizar(Modelo modelo) throws SQLException, ClassNotFoundException {
        Marca marca = (Marca) modelo;
        Connection conexion = BaseDatosConexion.obtener();
        String sql = "UPDATE marca SET  Nombre=? WHERE IdMarca=?";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, marca.getNombre());
        statement.setInt(2, marca.Id);
        statement.executeUpdate();
        conexion.close();
    }

    @Override
    public void eliminar(Modelo modelo) throws SQLException, ClassNotFoundException {
        Connection conexion = BaseDatosConexion.obtener();
        String sql = "DELETE FROM marca WHERE IdMarca=?";
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setInt(1, modelo.Id);
        statement.executeUpdate();
        conexion.close();
    }
}
