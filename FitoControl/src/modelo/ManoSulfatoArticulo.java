package modelo;

/**
 * @author Windar
 */
public class ManoSulfatoArticulo extends Modelo {
    private int idManoSulfato;
    private Articulo idArticulo;
    private TipoMedida idMedida;
    private int cantidad;

    /**
     * @param idArticulo
     * @param idMedida
     * @param cantidad
     */
    public ManoSulfatoArticulo(Articulo idArticulo, TipoMedida idMedida, int cantidad) {

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
    public Articulo getIdArticulo() {
        return idArticulo;
    }

    /**
     * @param idArticulo
     */
    public void setIdArticulo(Articulo idArticulo) {
        this.idArticulo = idArticulo;
    }

    /**
     * @return idMedida
     */
    public TipoMedida getIdMedida() {
        return idMedida;
    }

    /**
     * @param idMedida
     */
    public void setIdMedida(TipoMedida idMedida) {
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
        return "ManoSulfatoArticulo"
                + "idManoSulfato=" + idManoSulfato
                + "idArticulo=" + idArticulo
                + ", idMedida=" + idMedida
                + ", cantidad=" + cantidad ;
    }
}
