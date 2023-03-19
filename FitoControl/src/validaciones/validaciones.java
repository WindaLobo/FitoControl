package validaciones;

import fitocontrol.Repositorio;
import modelo.Articulo;
import modelo.Compra;
import modelo.CompraArticulo;
import modelo.Modelo;

import java.util.ArrayList;

public class validaciones {
    public static void validarnombre(String nombre) throws Exception {

        if (nombre.isEmpty()) {

            throw new Exception("No has añadido nada");
        }
    }

    public static void validarIdMarca(int IdDeMarca, ArrayList<Modelo> marcas) throws Exception {

        Modelo marcaEncontrado = null;

        for (Modelo marca : marcas) {

            if (marca.Id == IdDeMarca) {

                marcaEncontrado = marca;

                break;
            }
        }
        if (marcaEncontrado == null) {

            throw new Exception("Articulo seleccionado no existe ");
        }
    }


    public static Modelo validarArticuloEcontrado(int idArticulo, ArrayList<Modelo> articulos) throws Exception {

        Modelo articuloEncontrado = null;

        for (Modelo articulo : articulos) {

            if (articulo.Id == idArticulo) {

                articuloEncontrado = articulo;

                break;
            }
        }
        if (articuloEncontrado == null) {

            throw new Exception("Articulo seleccionado no existe ");

        }
        return articuloEncontrado;
    }

    public static void validarCantidadIntroducida(double cantidad) throws Exception {

        if (cantidad < 0) {

            throw new Exception("La cantidad no puede ser negativo");
        }
    }

    public static Modelo validarCompraDetalle(Compra compra, CompraArticulo detalleCompra) throws Exception {
        for (CompraArticulo compraDetalle : compra.getArticulos()) {

            if (compraDetalle.getArticulo().Id == detalleCompra.getArticulo().Id) {

                throw new Exception("El articulo introducido ya existe en la compra");
            }
        }
        return detalleCompra;
    }


}
