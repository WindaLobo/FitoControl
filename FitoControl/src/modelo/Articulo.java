package modelo;

/**
 * @author Windar
 */
public class Articulo extends Modelo {

    //Añadir atributo referencia
    private int cantidad;
    private String nombre;
    private int idInventario;
    private TipoMedida tipoMedida;
    private int idMarca;

    /**
     *
     * @param cantidad
     * @param nombre
     * @param idInventario
     * @param tipoMedida
     * @param idMarca
     */
    public Articulo(int cantidad, String nombre, int idInventario, TipoMedida tipoMedida, int idMarca) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.idInventario = idInventario;
        this.tipoMedida = tipoMedida;
        this.idMarca = idMarca;    
    }

    public Articulo() {
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
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return idInventario
     */
    public int getIdInventario() {
        return idInventario;
    }

    /**
     * @param idInventario
     */
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    /**
     * @return idMedida
     */
    public TipoMedida getIdMedida() {
        return tipoMedida;
    }

    /**
     * @param tipoMedida
     */
    public void setIdMedida(TipoMedida tipoMedida) {
        this.tipoMedida = tipoMedida;
    }

    /**
     * @return idMarca
     */
    public int getIdMarca() {
        return idMarca;
    }

    /**
     * @param idMarca
     */
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    /**
     * @return toString
     */
    @Override
    public String toString() {
        return "Articulo{"
                + ", cantidad=" + cantidad
                + ", nombre='" + nombre + '\''
                + ", idInventario=" + idInventario
                + ", tipoMedida=" + tipoMedida
                + ", idMarca=" + idMarca
                + '}';
    }
}
