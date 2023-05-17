package BaseDatosRepositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatosConexion {
    static Connection conexion = null;
    static String usuario = "postgres";
    static String contrasenia = "22124628";
    static String baseDeDatos = "FitoControl";
    static String ip = "localhost";
    static String puerto = "1818";
    static String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + baseDeDatos;

    public static Connection obtener() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        if(conexion == null || conexion.isClosed()){
            conexion = DriverManager.getConnection(cadena, usuario, contrasenia);
        }

        return conexion;

    }
}
