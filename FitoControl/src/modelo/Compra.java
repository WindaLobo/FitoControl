package modelo;

/**
 * Compra extends de modelo
 */
public class Compra extends Modelo {
    private String fecha;

    /**
     * @param fecha
     */
    public Compra(String fecha) {
        this.fecha = fecha;
    }

    /**
     * constructor vacio
     */
    public Compra() {
    }

    /**
     * @return fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return toString
     */
    @Override
    public String toString() {
        return "fecha=" + fecha;
    }
}
