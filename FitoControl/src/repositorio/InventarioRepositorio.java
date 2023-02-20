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
    public Modelo Añadir(Modelo modelo) {

        if (!Inventarios.isEmpty()) {
            Modelo last = Inventarios.get(Inventarios.size() - 1);
            modelo.Id = last.Id + 1;
        } else {
            modelo.Id = 1;
        }

        Inventarios.add(modelo);
        return modelo;
    }

    @Override
    public void Eliminar(Modelo modelo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Modificar(Modelo modelo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Modelo> ObtenerTodos() {
        return Inventarios;
    }

}
