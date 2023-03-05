package modelo;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 * Compra extends de modelo
 */
public class Compra extends Modelo {

    private Date fecha;
    private ArrayList<CompraArticulo> productos;

    public Compra() {
        this.fecha = Date.from(Instant.now());
        this.productos = new ArrayList<>();
    }

    public ArrayList<CompraArticulo> getProductos() {
        return productos;
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
        this.productos.add(producto);
    }

    /**
     * @return toString
     */
    @Override
    public String toString() {
        return fecha.toString();
    }
}
