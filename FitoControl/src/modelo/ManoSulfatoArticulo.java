package modelo;

/**
 * @author Windar
 */
public class ManoSulfatoArticulo extends Modelo{
    private int idArticulo;
    private int idMedida;
    private int cantidad;

    public ManoSulfatoArticulo() {
    }

    /**
     * @param idArticulo
     * @param idMedida
     * @param cantidad
     */

    public ManoSulfatoArticulo(int idArticulo, int idMedida, int cantidad) {
        this.idArticulo = idArticulo;
        this.idMedida = idMedida;
        this.cantidad = cantidad;

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
                "idArticulo=" + idArticulo +
                ", idMedida=" + idMedida +
                ", cantidad=" + cantidad +
                '}';
    }
}
