package modelo;

/**
 * @author Windar
 */

public class Articulo  extends Modelo{
    private int cantidad;
    private String nombre;
    private int idInventario;
    private int idMedida;
    private int idMarca;

    /**
   
     * @param cantidad
     * @param nombre
     * @param idInventario
     * @param idMedida
     * @param idMarca
     */
    public Articulo( int cantidad, String nombre, int idInventario, int idMedida, int idMarca) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.idInventario = idInventario;
        this.idMedida = idMedida;
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

    public int getIdMedida() {
        return idMedida;
    }

    /**
     * @param idMedida
     */

    public void setIdMedida(int idMedida) {
        this.idMedida = idMedida;
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
        return "Articulo{" +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", idInventario=" + idInventario +
                ", idMedida=" + idMedida +
                ", idMarca=" + idMarca +
                '}';
    }
}
