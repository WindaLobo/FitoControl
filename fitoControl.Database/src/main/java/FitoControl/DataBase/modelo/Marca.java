package FitoControl.DataBase.modelo;

public class Marca extends Modelo {
    private String nombre;

    public Marca(String nombre) {

        this.nombre = nombre;
    }

    public Marca(int Id, String nombre) {
        super.Id = Id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {

        return "\n Nombre : " + nombre +  " , Id : " + Id + " ";
    }

    public String toStringFichero() {

        return Id + "," + nombre;
    }
}
