package modelo;

/**
 * CompraArticulo
 */
public class CompraArticulo extends Modelo {
    private Articulo articulo;
    private int idCompra;
    private double cantidad;
    private double precio;

    /**
     * @param articulo
     * @param cantidad
     * @param precio
     */
    public CompraArticulo(Articulo articulo, double cantidad, double precio) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * Constructor vacio
     */
    public CompraArticulo() {
    }

    /**
     * @return articulo
     */
    public Articulo getArticulo() {
        return articulo;
    }

    /**
     * @param articulo
     */
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
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
                + "Articulo=" + articulo
                + ", idCompra=" + idCompra
                + ", cantidad=" + cantidad
                + ", precio=" + precio + "\n";
    }
}
