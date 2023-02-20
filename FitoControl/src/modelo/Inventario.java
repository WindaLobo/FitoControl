
package modelo;

/**
 * @author Inventario
 */
public class Inventario extends Modelo {
    private int cantidad;

    /**
     * @param cantidad
     */
    public Inventario(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Constructor vacio
     */
    public Inventario() {
    }

    /**
     * @return cantidad
     */

    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad
     */

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return toString
     */

    @Override
    public String toString() {

        return "cantidad=" + cantidad;
    }

}
