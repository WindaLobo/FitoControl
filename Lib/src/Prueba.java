import BaseDatosRepositorio.ArticuloBaseDatosRepositorio;
import modelo.Articulo;
import modelo.TipoMedida;

public class Prueba {
    public static void main(String[] args) throws Exception {
        ArticuloBaseDatosRepositorio articulo = new ArticuloBaseDatosRepositorio();
        Articulo ar = new Articulo( 1,"fungicida", TipoMedida.Gramos,5465,5);
        articulo.Añadir(ar);
        articulo.ObtenerTodos();
    }
}

//EmpleadoRepositorio emple = new EmpleadoRepositorio();
// Empleado empleado = new Permanente(5,"asdsada", "adrian", "Estevez", 100, 1000, LocalDate.now());
// emple.insertarEmpleado(empleado);
// emple.obtenerEmpleados();
// emple.actualizarEmpleado(empleado);
// emple.eliminarEmpleado(empleado);


