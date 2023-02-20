package repositorio;

import java.util.ArrayList;
import modelo.Modelo;

/**
 *
 * @author Windar
 */
public class MarcaRepositorio implements IRepositorio {

    private final ArrayList<Modelo> Marcas = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Modelo Añadir(Modelo marcas) {

        if (!Marcas.isEmpty()) {
            Modelo last = Marcas.get(Marcas.size() - 1);
            marcas.Id = last.Id + 1;
        } else {
            marcas.Id = 1;
        }

        Marcas.add(marcas);
        return marcas;
    }

    @Override
    public void Eliminar(Modelo marcas) {
       Marcas.remove(marcas);
    }

    @Override
    public void Modificar(Modelo marcas) {
        int index = Marcas.indexOf(marcas);
        if (index > -1) {
            Marcas.set(index, marcas);
        }
    }
    @Override
    public ArrayList<Modelo> ObtenerTodos() {
        for (Modelo marcas : Marcas) {
            System.out.println(marcas);
        }
        return Marcas;
    }

}
