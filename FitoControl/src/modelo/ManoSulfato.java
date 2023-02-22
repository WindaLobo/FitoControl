package modelo;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author ManoSulfato
 */
public class ManoSulfato extends Modelo {

    private Date fecha;
     private ArrayList<ManoSulfatoArticulo> cantidad;

    /**
     * @param fecha
     */
    public ManoSulfato(String fecha) {
        this.fecha = Date.from(Instant.now());
        this.cantidad = new ArrayList<>();
    }

    /**
     * Constructor vacio
     */
    public ManoSulfato() {
    }
    
    public ArrayList<ManoSulfatoArticulo> getCantidad() {
        return cantidad;
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
    public void añadirCantidad(ManoSulfatoArticulo cantidades){
        this.cantidad.add(cantidades);
    }

    /**
     * @return toString
     */
    @Override
    public String toString() {
        return "fecha='" + fecha;
    }
}
