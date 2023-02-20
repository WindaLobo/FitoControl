
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
    public Modelo Añadir(Modelo tipoMedidas) {

        if (!TipoMedidas.isEmpty()) {
            Modelo last = TipoMedidas.get(TipoMedidas.size() - 1);
            tipoMedidas.Id = last.Id + 1;
        } else {
            tipoMedidas.Id = 1;
        }

        TipoMedidas.add(tipoMedidas);
        return tipoMedidas;
    }

    @Override
    public void Eliminar(Modelo tipoMedidas) {
       TipoMedidas.remove(tipoMedidas);
    }

    @Override
    public void Modificar(Modelo tipoMedidas) {
      int index = TipoMedidas.indexOf(tipoMedidas);
        if (index > -1) {
            TipoMedidas.set(index, tipoMedidas);
        }
    }

    @Override
    public ArrayList<Modelo> ObtenerTodos() {
        for (Modelo tipoMedidas : TipoMedidas) {
            System.out.println(tipoMedidas);
        }
        return TipoMedidas;
    }
}
