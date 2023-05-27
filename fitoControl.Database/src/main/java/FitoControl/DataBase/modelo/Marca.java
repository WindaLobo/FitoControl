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

    /**
     * Compara este objeto Marca con otro objeto para determinar si son iguales.
     *
     * @param o el objeto a comparar con esta instancia de Marca.
     * @return true si los objetos son iguales, false de lo contrario.
     */
    @Override
    public boolean equals(Object o) {


        if (o == this) {
            return true;
        }

        if (!(o instanceof Marca)) {
            return false;
        }

        Marca c = (Marca) o;

        return Id == c.Id;
    }
}
