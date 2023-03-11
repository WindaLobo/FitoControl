package modelo;

import fitocontrol.Repositorio;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 * Compra extends de modelo
 */
public class Compra extends Modelo {
    private Date fecha;
    private ArrayList<CompraArticulo> articulos;

    public Compra() {
        this.fecha = Date.from(Instant.now());
        this.articulos = new ArrayList<>();
    }

    public ArrayList<CompraArticulo> getArticulos() {
        return articulos;
    }

    /**
     * @return fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void añadirProducto(CompraArticulo producto) {
        this.articulos.add(producto);
    }

    /**
     * @return toString
     */
    @Override
    public String toString() {

        return fecha.toString() + articulos.toString();

    }
}
