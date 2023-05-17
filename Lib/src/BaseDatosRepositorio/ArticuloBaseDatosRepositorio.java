package BaseDatosRepositorio;

import modelo.Articulo;
import modelo.Modelo;
import modelo.TipoMedida;

import java.sql.*;
import java.util.ArrayList;

public class ArticuloBaseDatosRepositorio implements IBaseDatosRepositorio {
    private static final ArrayList<Modelo> Articulos = new ArrayList<>();

    @Override
    public ArrayList<Modelo> ObtenerTodos() throws SQLException, ClassNotFoundException {
        Connection conexion = BaseDatosConexion.obtener();
        String sql = " Select IdArticulo, Nombre, Cantidad,IdMArca,IdMedida ";

        Statement statement = conexion.createStatement();
        ResultSet resultado = statement.executeQuery(sql);

        while (resultado.next()) {
            Articulo ariculo = new Articulo(
            resultado.getInt("IdArticulo"),
                    resultado.getString("Nombre"),
                    TipoMedida.values()[resultado.getInt("IdMedida")],
                    resultado.getInt("IdMArca"),
                    resultado.getDouble("Candidad"));


            Articulos.add(ariculo);
        }

        conexion.close();
        return Articulos;
}
    @Override
    public Modelo Añadir(Modelo modelo ) throws Exception {
        Articulo articulo = (Articulo) modelo;
        Connection conexion = BaseDatosConexion.obtener();
        String sql = "INSERT INTO Articulo ( IdArticulo, Nombre,IdMedida,IdMArca Cantidad )"
                + "VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(2, articulo.getNombre());
        statement.setInt(3, articulo.getTipoMedida().ordinal());
        statement.setInt(4, articulo.getIdMarca());
        statement.setDouble(5, articulo.getCantidad());






        return null;
    }
}
