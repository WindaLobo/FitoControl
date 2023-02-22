package repositorio;

import java.util.ArrayList;
import modelo.Modelo;

public class InventarioRepositorio implements IRepositorio {

    private final ArrayList<Modelo> Inventarios = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) throws Exception {
        for (Modelo inventario : Inventarios) {
            if (inventario.Id == id) {
                return inventario;
            }
        }
        throw new Exception("Error no se ha podido encontrar el inventario ");
    }

    @Override
    public Modelo Añadir(Modelo inventario) {

        if (!Inventarios.isEmpty()) {
            Modelo last = Inventarios.get(Inventarios.size() - 1);
            inventario.Id = last.Id + 1;
        } else {
            inventario.Id = 1;
        }

        Inventarios.add(inventario);
        return inventario;
    }

    @Override
    public void Eliminar(Modelo invetarios) {
        Inventarios.remove(invetarios);
    }

    @Override
    public void Modificar(Modelo invetarios) {
        int index = Inventarios.indexOf(invetarios);
        if (index > -1) {
            Inventarios.set(index, invetarios);
        }
    }

    @Override
    public ArrayList<Modelo> ObtenerTodos() {

        return Inventarios;
    }

}
