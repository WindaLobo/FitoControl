/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * @author Inventario
 */
public class Inventario extends Modelo {
    private int cantidad;

    /**
     * @param cantidad
     */
    public Inventario(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Constructor vacio
     */
    public Inventario() {
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

        return "cantidad=" + cantidad;
    }

}
