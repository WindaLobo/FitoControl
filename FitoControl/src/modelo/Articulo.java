package modelo;

/**
 * @author Windar
 */
public class Articulo extends Modelo {

    //Añadir atributo referencia
    private String nombre;
    private TipoMedida tipoMedida;
    private int idMarca;
    private double cantidad;
 
    /**
     *
     * @param nombre
     * @param tipoMedida
     * @param idMarca
     */
    public Articulo(String nombre, TipoMedida tipoMedida, int idMarca) {
        this.nombre = nombre;
        this.tipoMedida = tipoMedida;
        this.idMarca = idMarca;
    }
    
    public Articulo() {
    }


    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
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
     * @return idInventario
     */
  
    /**
     * @return idMedida
     */
    public TipoMedida getIdMedida() {
        return tipoMedida;
    }

    /**
     * @param tipoMedida
     */
    public void setIdMedida(TipoMedida tipoMedida) {
        this.tipoMedida = tipoMedida;
    }

    /**
     * @return idMarca
     */
    public int getIdMarca() {
        return idMarca;
    }

    /**
     * @param idMarca
     */
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
    
  
      /**
     * @return toString
     */
    @Override
    public String toString() {
        return "Articulo"
                + ", nombre :" + nombre
                + ", tipoMedida :" + tipoMedida
                + ", idMarca :" + idMarca;
    }
}

