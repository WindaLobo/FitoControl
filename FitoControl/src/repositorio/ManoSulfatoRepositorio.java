package repositorio;

import java.util.ArrayList;
import modelo.ManoSulfato;
import modelo.ManoSulfatoArticulo;
import modelo.Modelo;

/**
 *
 * @author Windar
 */
public class ManoSulfatoRepositorio implements IRepositorio {

    private final ArrayList<Modelo> ManosSulfato = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) throws Exception {
        for (Modelo manoSulfato : ManosSulfato) {
            if (manoSulfato.Id == id) {
                return manoSulfato;
            }
        }

        throw new Exception("Mano sulfato no encontrada");
    }

    @Override
    public Modelo Añadir(Modelo modelo) {
        ManoSulfato manoSulfato = (ManoSulfato) modelo;
        if (!ManosSulfato.isEmpty()) {
            Modelo last = ManosSulfato.get(ManosSulfato.size() - 1);
            manoSulfato.Id = last.Id + 1;
        } else {
            manoSulfato.Id = 1;
        }
        for (ManoSulfatoArticulo producto : manoSulfato.getProductos()) {
            producto.setIdManoSulfato(manoSulfato.Id);
        }

        ManosSulfato.add(manoSulfato);
        return manoSulfato;
    }

    @Override
    public void Eliminar(Modelo manoSulfato) {
        ManosSulfato.remove(manoSulfato);
    }

    @Override
    public void Modificar(Modelo manoSulfato) {
        int index = ManosSulfato.indexOf(manoSulfato);
        if (index > -1) {
            ManosSulfato.set(index, manoSulfato);
        }
    }

    @Override
    public ArrayList<Modelo> ObtenerTodos() {

        return ManosSulfato;
    }

}
