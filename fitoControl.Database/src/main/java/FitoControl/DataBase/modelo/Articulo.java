package FitoControl.DataBase.modelo;

public class Articulo extends Modelo {
    private String nombre;
    private TipoMedida tipoMedida;
    private int idMarca;
    private Marca marca;
    private double cantidad;

    public Articulo(int Id, String nombre) {
        super.Id = Id;
        this.nombre = nombre;
    }

    public Articulo(int Id, String nombre, TipoMedida tipoMedida, Marca marca, double cantidad) {
        super.Id = Id;
        this.nombre = nombre;
        this.tipoMedida = tipoMedida;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public Articulo(int Id, String nombre, TipoMedida tipoMedida, int idMarca, double cantidad) {
        super.Id = Id;
        this.nombre = nombre;
        this.tipoMedida = tipoMedida;
        this.idMarca = idMarca;
        this.cantidad = cantidad;
    }

    public Articulo() {
    }


    public double getCantidad() {
        return cantidad;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setCantidad(double cantidad) {

        this.cantidad = cantidad;
        setChanged();
        notifyObservers(this);
    }


    public void setTipoMedida(TipoMedida tipoMedida) {
        this.tipoMedida = tipoMedida;
        setChanged();
        notifyObservers(this);
    }


    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
        setChanged();
        notifyObservers(this);
    }

    public String getNombre() {
        return nombre;
    }

    public TipoMedida getTipoMedida() {
        return tipoMedida;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        setChanged();
        notifyObservers(this);
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
        setChanged();
        notifyObservers(this);
    }


    @Override
    public String toString() {
        return nombre;
    }

    public String toStringFichero() {
        return Id + "," + nombre + "," + tipoMedida.ordinal() + "," + idMarca + "," + cantidad;
    }
}

