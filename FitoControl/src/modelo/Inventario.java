package modelo;

/**
 * @author Inventario
 */
public class Inventario extends Modelo {

    private double cantidad;

    /**
     * @param cantidad
     */
    public Inventario(double cantidad) {
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
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad
     */
    public void setCantidad(double cantidad) {
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
