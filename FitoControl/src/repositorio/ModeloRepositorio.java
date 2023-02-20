package repositorio;

import java.util.ArrayList;
import modelo.Modelo;

/**
 *
 * @author Windar
 */
public class ModeloRepositorio implements IRepositorio {

    private final ArrayList<Modelo> Modelos = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Modelo Añadir(Modelo modelos) {

        if (!Modelos.isEmpty()) {
            Modelo last = Modelos.get(Modelos.size() - 1);
            modelos.Id = last.Id + 1;
        } else {
            modelos.Id = 1;
        }

        Modelos.add(modelos);
        return modelos;
    }

    @Override
    public void Eliminar(Modelo modelos) {
      Modelos.remove(modelos);
    }

    @Override
    public void Modificar(Modelo modelos) {
       int index = Modelos.indexOf(modelos);
        if (index > -1) {
            Modelos.set(index, modelos);
        }
    }

    @Override
    public ArrayList<Modelo> ObtenerTodos() {
        for (Modelo modelos : Modelos) {
            System.out.println(modelos);
        }
        return Modelos;
    }

}
