/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * @author Windar
 */
public class ManoSulfatoArticulo {
    private int idArticulo;
    private int idManoSulfato;
    private int idMedida;
    private int cantidad;

    public ManoSulfatoArticulo() {
    }

    /**
     * @param idArticulo
     * @param idManoSulfato
     * @param idMedida
     * @param cantidad
     */

    public ManoSulfatoArticulo(int idArticulo, int idManoSulfato, int idMedida, int cantidad) {
        this.idArticulo = idArticulo;
        this.idManoSulfato = idManoSulfato;
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
     * @setIdArticulo idArticulo
     */
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    /**
     * @return idManoSulfato
     */

    public int getIdManoSulfato() {
        return idManoSulfato;
    }

    /**
     * @setIdManoSulfato idManoSulfato
     */

    public void setIdManoSulfato(int idManoSulfato) {
        this.idManoSulfato = idManoSulfato;
    }

    /**
     * @return idMedida
     */
    public int getIdMedida() {
        return idMedida;
    }

    /**
     * @setIdMedida idMedida
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
     * @setCantidad cantidad
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
                ", idManoSulfato=" + idManoSulfato +
                ", idMedida=" + idMedida +
                ", cantidad=" + cantidad +
                '}';
    }
}
