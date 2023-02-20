/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * @author ManoSulfato
 */
public class ManoSulfato extends Modelo {
    private String fecha;

    /**
     * @param fecha
     */
    public ManoSulfato(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Constructor vacio
     */
    public ManoSulfato() {
    }

    /**
     * @return fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @setFecha fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return toString
     */
    @Override
    public String toString() {
        return
                "fecha='" + fecha;
    }
}
