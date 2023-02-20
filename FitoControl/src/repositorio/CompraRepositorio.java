
package repositorio;

import java.util.ArrayList;
import modelo.Modelo;

public class CompraRepositorio implements IRepositorio {

    private final ArrayList<Modelo> Compras = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Modelo Añadir(Modelo modelo) {

        if (!Compras.isEmpty()) {
            Modelo last = Compras.get(Compras.size() - 1);
            modelo.Id = last.Id + 1;
        } else {
            modelo.Id = 1;
        }

        Compras.add(modelo);
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
        return Compras;
    }

}
