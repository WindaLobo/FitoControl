
package repositorio;

import java.util.ArrayList;
import modelo.Modelo;

/**
 *
 * @author Windar
 */
public class TipoMedidaRepositorio implements IRepositorio {

    private final ArrayList<Modelo> TipoMedidas = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Modelo Añadir(Modelo modelo) {

        if (!TipoMedidas.isEmpty()) {
            Modelo last = TipoMedidas.get(TipoMedidas.size() - 1);
            modelo.Id = last.Id + 1;
        } else {
            modelo.Id = 1;
        }

        TipoMedidas.add(modelo);
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
        return TipoMedidas;
    }

}
