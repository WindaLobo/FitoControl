package repositorio;

import java.util.ArrayList;
import modelo.Modelo;

/**
 *
 * @author Windar
 */
public class ManoSulfatoRepositorio implements IRepositorio {

    private final ArrayList<Modelo> ManoSulfato = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Modelo Añadir(Modelo manoSulfato) {

        if (!ManoSulfato.isEmpty()) {
            Modelo last = ManoSulfato.get(ManoSulfato.size() - 1);
            manoSulfato.Id = last.Id + 1;
        } else {
            manoSulfato.Id = 1;
        }

        ManoSulfato.add(manoSulfato);
        return manoSulfato;
    }

    @Override
    public void Eliminar(Modelo manoSulfato) {
       ManoSulfato.remove(manoSulfato);
    }

    @Override
    public void Modificar(Modelo manoSulfato) {
        int index = ManoSulfato.indexOf(manoSulfato);
        if (index > -1) {
            ManoSulfato.set(index, manoSulfato);
        }
    }

    @Override
    public ArrayList<Modelo> ObtenerTodos() {
        for (Modelo manoSulfato : ManoSulfato) {
            System.out.println(manoSulfato);
        }
        return ManoSulfato;
    }

}
