package modelo;

/**
 * @author Windar
 */


public class Articulo {
    private int idArticulo;
    private int cantidad;
    private String nombre;
    private int idInventario;
    private int idMedida;
    private int idMarca;

    /**
     * @param idArticulo
     * @param cantidad
     * @param nombre
     * @param idInventario
     * @param idMedida
     * @param idMarca
     */
    public Articulo(int idArticulo, int cantidad, String nombre, int idInventario, int idMedida, int idMarca) {
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.idInventario = idInventario;
        this.idMedida = idMedida;
        this.idMarca = idMarca;
    }


    public Articulo() {
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
                "idArticulo=" + idArticulo +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", idInventario=" + idInventario +
                ", idMedida=" + idMedida +
                ", idMarca=" + idMarca +
                '}';
    }
}
