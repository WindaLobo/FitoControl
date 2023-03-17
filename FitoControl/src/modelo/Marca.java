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
    public Marca(int Id ,String nombre) {
        super.Id=Id;
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

        return "\n Id : " + Id + " Nombre :" + nombre + "\n";
    }

    public  String toStringFichero() {

        return  Id + "," + nombre;
    }

}
