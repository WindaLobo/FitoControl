package FitoControl.DataBase.BaseDatosRepositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que se encarga de establecer la conexión a la base de datos.
 */
public class BaseDatosConexion {
    static Connection conexion = null;
    static String usuario = "postgres";
    static String contrasenia = "22124628";
    static String baseDeDatos = "FitoControl";
    static String ip = "localhost";
    static String puerto = "1818";
    static String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + baseDeDatos;

    /**
     * Obtiene una instancia de conexión a la base de datos.
     *
     * @return La conexión a la base de datos.
     * @throws ClassNotFoundException Si no se encuentra el controlador de la base de datos.
     * @throws SQLException           Si ocurre un error al establecer la conexión.
     */

    public static Connection obtener() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        if (conexion == null || conexion.isClosed()) {
            conexion = DriverManager.getConnection(cadena, usuario, contrasenia);
        }

        return conexion;

    }
}
