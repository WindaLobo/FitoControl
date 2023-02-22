package modelo;

/**
 * @author Windar
 */
public class ManoSulfatoArticulo extends Modelo{
    private int idManoSulfato;
    private int idArticulo;
    private int idMedida;
    private int cantidad;

    public ManoSulfatoArticulo() {
    }

    /**
     * @param idManoSulfato
     * @param idArticulo
     * @param idMedida
     * @param cantidad
     */

    public ManoSulfatoArticulo(int idManoSulfato, int idArticulo, int idMedida, int cantidad) {
        this.idManoSulfato = idManoSulfato;
        this.idArticulo = idArticulo;
        this.idMedida = idMedida;
        this.cantidad = cantidad;

    }

    public int getIdManoSulfato() {
        return idManoSulfato;
    }

    public void setIdManoSulfato(int idManoSulfato) {
        this.idManoSulfato = idManoSulfato;
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
     * @return toString
     */
    @Override
    public String toString() {
        return "ManoSulfatoArticulo{" +
                "idManoSulfato=" + idManoSulfato +
                "idArticulo=" + idArticulo +
                ", idMedida=" + idMedida +
                ", cantidad=" + cantidad +
                '}';
    }
}
