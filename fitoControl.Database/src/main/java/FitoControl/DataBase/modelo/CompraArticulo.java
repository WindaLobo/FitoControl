package FitoControl.DataBase.modelo;

public class CompraArticulo extends Modelo {
    private Articulo articulo;
    private int idArticulo;
    private int idCompra;
    private double cantidad;
    private double precio;

    public CompraArticulo(int Id, int idCompra, Articulo articulo, double cantidad, double precio) {
        super.Id = Id;
        this.idCompra = idCompra;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public CompraArticulo(Articulo articulo, double cantidad, double precio) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public CompraArticulo(int Id, Articulo articulo, double cantidad, double precio) {
        super.Id = Id;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public CompraArticulo(int Id, int idCompra, int idArticulo, double cantidad, double precio) {
        super.Id = Id;
        this.idCompra = idCompra;
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public CompraArticulo() {
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
        setChanged();
        notifyObservers(this);
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
        setChanged();
        notifyObservers(this);
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        setChanged();
        notifyObservers(this);
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
        setChanged();
        notifyObservers(this);
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
        setChanged();
        notifyObservers(this);
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return articulo
                + ", cantidad : " + cantidad
                + ", precio   : " + precio + "\n";
    }

    public String toStringFichero() {

        return Id + "," + idCompra + "," + articulo.Id + "," + cantidad + "," + precio;
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof CompraArticulo)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        CompraArticulo c = (CompraArticulo) o;

        // Compare the data members and return accordingly
        return Id == c.Id;
    }
}
