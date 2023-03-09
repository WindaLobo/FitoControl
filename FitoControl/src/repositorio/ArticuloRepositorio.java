package repositorio;

import java.util.ArrayList;
import modelo.Modelo;
public class ArticuloRepositorio implements IRepositorio {
    private static final ArrayList<Modelo> Articulos = new ArrayList<>();
   //Metodo para obtener por nombre / Nombres que contengan la cadena introducida por el user / Lanzar exception si no existe
    //Metodo para obtener por referencia / Busqueda exacta / Lanzar exception si no existe
    @Override
    public Modelo Obtener(int id) throws Exception {
        for (Modelo articulo : Articulos) {
            if (articulo.Id == id) {
                return articulo;
            }
        }
        throw new Exception("Articulo no encontrado");
    }
    @Override
    public Modelo Añadir(Modelo articulo) {

        if (!Articulos.isEmpty()) {
            Modelo last = Articulos.get(Articulos.size() - 1);
            articulo.Id = last.Id + 1;
        } else {
            articulo.Id = 1;
        }
        Articulos.add(articulo);
        return articulo;
    }
    @Override
    public void Eliminar(Modelo articulo) {
        Articulos.remove(articulo);
    }

    @Override
    public void Modificar(Modelo articulo) {
        int index = Articulos.indexOf(articulo);
        if (index > -1) {
            Articulos.set(index, articulo);
        }
    }
    @Override
    public ArrayList<Modelo> ObtenerTodos() {
        return Articulos;
    }

}
