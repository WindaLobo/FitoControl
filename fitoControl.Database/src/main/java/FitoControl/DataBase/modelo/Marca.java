package FitoControl.DataBase.modelo;

public class Marca extends Modelo  {
    private String nombre;

    public Marca(String nombre) {

        this.nombre = nombre;
    }

    public Marca(int Id, String nombre) {
        super.Id = Id;
        this.nombre = nombre;
    }

    public Marca() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        setChanged();
        notifyObservers(this);
    }

    @Override
    public String toString() {

        return nombre;
    }


    public String toStringFichero() {

        return Id + "," + nombre;
    }

    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Marca)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Marca c = (Marca) o;

        // Compare the data members and return accordingly
        return Id == c.Id;
    }
}
