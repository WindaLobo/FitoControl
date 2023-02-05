package repositorio;

import java.util.ArrayList;
import modelo.Modelo;

public class ArticuloRepositorio implements IRepositorio {

    private final ArrayList<Modelo> Articulos = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Modelo Añadir(Modelo modelo) {

        if (!Articulos.isEmpty()) {
            Modelo last = Articulos.get(Articulos.size() - 1);
            modelo.Id = last.Id + 1;
        } else {
            modelo.Id = 1;
        }

        Articulos.add(modelo);
        return modelo;
    }

    @Override
    public void Eliminar(Modelo modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Modificar(Modelo modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Modelo> ObtenerTodos() {
        return Articulos;
    }

}
