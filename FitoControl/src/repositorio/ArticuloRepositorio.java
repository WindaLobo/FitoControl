package repositorio;

import java.util.ArrayList;
import modelo.Modelo;

public class ArticuloRepositorio implements IRepositorio {

    private final ArrayList<Modelo> Articulos = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) {
         String obte = Articulos.get(id).toString();
         System.out.println(obte);
        return null;
    }

    @Override
    public Modelo Añadir(Modelo articulos) {

        if (!Articulos.isEmpty()) {
            Modelo last = Articulos.get(Articulos.size() - 1);
            articulos.Id = last.Id + 1;
        } else {
            articulos.Id = 1;
        }

        Articulos.add(articulos);
        return articulos;
    }

    @Override
    public void Eliminar(Modelo articulos) {
        Articulos.remove(articulos);
    }

    @Override
    public void Modificar(Modelo articulos) {
        int index = Articulos.indexOf(articulos);
        if (index > -1) {
            Articulos.set(index, articulos);
        }
    }

    @Override
    public ArrayList<Modelo> ObtenerTodos() {
        for (Modelo articulos : Articulos) {
            System.out.println(articulos);
        }
        return Articulos;
    }

}
