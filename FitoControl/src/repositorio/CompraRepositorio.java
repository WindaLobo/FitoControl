
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
    public Modelo Añadir(Modelo compras) {

        if (!Compras.isEmpty()) {
            Modelo last = Compras.get(Compras.size() - 1);
            compras.Id = last.Id + 1;
        } else {
            compras.Id = 1;
        }

        Compras.add(compras);
        return compras;
    }

    @Override
    public void Eliminar(Modelo compras) {
        Compras.remove(compras);
    }

    @Override
    public void Modificar(Modelo compras) {
         int index = Compras.indexOf(compras);
        if (index > -1) {
            Compras.set(index, compras);
    }
    }

    @Override
    public ArrayList<Modelo> ObtenerTodos() {
         for (Modelo compras : Compras) {
            System.out.println(compras);
        }
        return Compras;
    }

}
