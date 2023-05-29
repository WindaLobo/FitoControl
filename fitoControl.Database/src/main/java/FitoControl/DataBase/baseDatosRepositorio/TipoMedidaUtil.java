package FitoControl.DataBase.baseDatosRepositorio;

import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.TipoMedida;

public class TipoMedidaUtil {


    /**
     * Ajusta una cantidad dada de un artículo al tipo de medida especificado.
     *
     * @param articulo    el objeto Articulo para el cual se desea ajustar la cantidad.
     * @param tipoMedida  el tipo de medida al cual se desea ajustar la cantidad.
     * @param cantidad    la cantidad a ajustar.
     * @return la cantidad ajustada al tipo de medida especificado.
     */

    public static  double obtenerCantidadAjustadaATipoMedida(Articulo articulo, TipoMedida tipoMedida, double cantidad) {

        if (articulo.getTipoMedida() == tipoMedida) {
            return cantidad;
        }

        switch (articulo.getTipoMedida()) {
            case Kilos:
                cantidad = cantidad / 1000;
                break;
            case Gramos:
                cantidad = cantidad * 1000;
                break;
            case Litros:
                switch (tipoMedida) {
                    case Centilitros:
                        cantidad = cantidad / 100;
                        break;
                    case Mililitros:
                        cantidad = cantidad / 1000;
                        break;
                }
                break;
            case Centilitros:
                switch (tipoMedida) {
                    case Litros:
                        cantidad = cantidad * 100;
                        break;
                    case Mililitros:
                        cantidad = cantidad / 10;
                        break;
                }
                break;
            case Mililitros:
                switch (tipoMedida) {
                    case Centilitros:
                        cantidad = cantidad * 10;
                        break;
                    case Litros:
                        cantidad = cantidad * 1000;
                        break;
                }
                break;
        }

        return cantidad;
    }
}


