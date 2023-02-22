package modelo;

/**
 * CompraArticulo
 */
public class CompraArticulo {

    private int idArticulo;
    private int idCompra;
    private double cantidad;
    private double precio;

    /**
     * @param idArticulo
     * @param idCompra
     * @param cantidad
     * @param precio
     */
    public CompraArticulo(int idArticulo, int idCompra, double cantidad, double precio) {
        this.idArticulo = idArticulo;
        this.idCompra = idCompra;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * Constructor vacio
     */
    public CompraArticulo() {
    }

    /**
     * @return idArticulo
     */
    public int getIdArticulo() {
        return idArticulo;
    }

    /**
     * @param idArticulo
     */
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    /**
     * @return idCompra
     */
    public int getIdCompra() {
        return idCompra;
    }

    /**
     * @param idCompra
     */
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
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
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return toString
     */
    @Override
    public String toString() {
        return "CompraArticulo{"
                + "idArticulo=" + idArticulo
                + ", idCompra=" + idCompra
                + ", cantidad=" + cantidad
                + ", precio=" + precio
                + '}';
    }
}
