/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
     * @setNombre nombre
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
