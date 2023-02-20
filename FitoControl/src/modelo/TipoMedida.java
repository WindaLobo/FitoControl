
package modelo;

/**
 * @author TipoMedida
 */
public class TipoMedida extends Modelo {
    private String nombre;

    /**
     * @param nombre
     */
    public TipoMedida(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor vacio
     */
    public TipoMedida() {
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
     * @return toString
     */
    @Override
    public String toString() {

        return "nombre=" + nombre;
    }


}
