package modelo;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author ManoSulfato
 */
public class ManoSulfato extends Modelo {

    private Date fecha;
    private ArrayList<ManoSulfatoArticulo> productos;

    /**
     * @param fecha
     */
    public ManoSulfato(String fecha) {
        this.fecha = Date.from(Instant.now());
        this.productos = new ArrayList<>();
    }

    /**
     * Constructor vacio
     */
    public ManoSulfato() {
    }

    public ArrayList<ManoSulfatoArticulo> getProductos() {
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

    public void añadirProducto(ManoSulfatoArticulo producto) {
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
