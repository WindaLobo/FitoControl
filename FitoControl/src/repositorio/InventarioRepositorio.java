package repositorio;

import java.util.ArrayList;
import modelo.Modelo;

public class InventarioRepositorio implements IRepositorio {

    private final ArrayList<Modelo> Inventarios = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Modelo Añadir(Modelo invetarios) {

        if (!Inventarios.isEmpty()) {
            Modelo last = Inventarios.get(Inventarios.size() - 1);
            invetarios.Id = last.Id + 1;
        } else {
            invetarios.Id = 1;
        }

        Inventarios.add(invetarios);
        return invetarios;
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
         for (Modelo inventarios : Inventarios) {
            System.out.println(inventarios);
        }
        return Inventarios;
    }

}
