package modelo;

/**
 * CompraArticulo
 */
public class CompraArticulo extends Modelo {
    private Articulo articulo;
    private int idArticulo;
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
    public CompraArticulo(int Id, Articulo articulo, double cantidad, double precio) {
        super.Id=Id;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public CompraArticulo(int Id, int idCompra, int idArticulo, double cantidad, double precio) {
        super.Id=Id;
        this.idCompra = idCompra;
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdArticulo() {
        return idArticulo;
    }
    /**
     * Constructor vacio
     */


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
        return   articulo
                +", cantidad : " + cantidad
                +", precio   : " + precio + "\n";
    }
    public String toStringFichero() {

        return Id + ","+ idCompra + "," + articulo.Id + ","  + cantidad + "," + precio;
    }
}
