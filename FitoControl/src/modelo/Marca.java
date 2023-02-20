/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * @author Marca
 */
public class Marca extends Modelo {
    private String nombre;

    /**
     * @param nombre
     */
    public Marca(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor vacio
     */
    public Marca() {
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
