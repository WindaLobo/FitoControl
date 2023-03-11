package validaciones;

import modelo.Modelo;

import java.util.ArrayList;

public class validaciones {
    public static void validarnombre(String nombre) throws Exception {

        if (nombre.isEmpty()) {

            throw new Exception("No has añadido ninguna Articulo");
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

    public static void validadNombreDeLAMarca(String nombre) throws Exception {

        if (nombre.isEmpty()) {

            throw new Exception("No has añadido ninguna marca");
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


}
