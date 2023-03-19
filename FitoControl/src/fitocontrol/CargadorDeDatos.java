package fitocontrol;
import modelo.Articulo;
import modelo.Compra;
import modelo.CompraArticulo;
import modelo.Modelo;

public class CargadorDeDatos {
    public static void cargarDatos() throws Exception {
        Repositorio.Marcas.cargarDesdeFichero();
        Repositorio.Articulos.cargarDesdeFichero();
        Repositorio.Compra.cargarDesdeFichero();

        for (Modelo recorrerCompra : Repositorio.Compra.ObtenerTodos()) {
            Compra compra = (Compra) recorrerCompra;
            for (Modelo recorrerDetalle : compra.getArticulos()) {
                CompraArticulo compraArticulo = (CompraArticulo) recorrerDetalle;
                compraArticulo.setArticulo(obtenerArticulo(compraArticulo));
            }

        }

    }
    private static Articulo obtenerArticulo(CompraArticulo compraArticulo) throws Exception {
        for(Modelo recorrerArticulo : Repositorio.Articulos.ObtenerTodos()){
            if(  compraArticulo.getIdArticulo()==recorrerArticulo.Id){
                return (Articulo) recorrerArticulo;
            }
        }

        throw  new Exception("Articulo no encontrado");

    }
}
