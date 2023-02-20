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
    public Modelo Añadir(Modelo modelo) {

        if (!Marcas.isEmpty()) {
            Modelo last = Marcas.get(Marcas.size() - 1);
            modelo.Id = last.Id + 1;
        } else {
            modelo.Id = 1;
        }

        Marcas.add(modelo);
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
        return Marcas;
    }

}
