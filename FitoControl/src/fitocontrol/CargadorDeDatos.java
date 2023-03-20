package fitocontrol;

import modelo.*;

public class CargadorDeDatos {
    public static void cargarDatos() throws Exception {

        Repositorio.Marcas.cargarDesdeFichero();

        Repositorio.Articulos.cargarDesdeFichero();

        Repositorio.Compra.cargarDesdeFichero();

        Repositorio.ManoSulfato.cargarDesdeFichero();

        for (Modelo recorrerCompra : Repositorio.Compra.ObtenerTodos()) {

            Compra compra = (Compra) recorrerCompra;

            for (Modelo recorrerDetalle : compra.getArticulos()) {

                CompraArticulo compraArticulo = (CompraArticulo) recorrerDetalle;

                compraArticulo.setArticulo(obtenerArticulo(compraArticulo));
            }

        }
        for (Modelo recorrerManoSulfato : Repositorio.ManoSulfato.ObtenerTodos()) {

            ManoSulfato manoSulfato = (ManoSulfato) recorrerManoSulfato;

            for (Modelo recorrerDetalle : manoSulfato.getArticulos()) {

                ManoSulfatoArticulo manoSulfatoArticulo = (ManoSulfatoArticulo) recorrerDetalle;

                manoSulfatoArticulo.setArticulo(obtenerManoSulfato(manoSulfatoArticulo));
            }

        }

    }

    private static Articulo obtenerArticulo(CompraArticulo compraArticulo) throws Exception {

        for (Modelo recorrerArticulo : Repositorio.Articulos.ObtenerTodos()) {

            if (compraArticulo.getIdArticulo() == recorrerArticulo.Id) {

                return (Articulo) recorrerArticulo;
            }
        }

        throw new Exception("Articulo no encontrado");
    }

    private static Articulo obtenerManoSulfato(ManoSulfatoArticulo manoSulfatoArticulo) throws Exception {

        for (Modelo recorrerArticulo : Repositorio.Articulos.ObtenerTodos()) {

            if (manoSulfatoArticulo.getIdArticulo() == recorrerArticulo.Id) {

                return (Articulo) recorrerArticulo;
            }
        }

        throw new Exception("Articulo no encontrado");

    }
}
