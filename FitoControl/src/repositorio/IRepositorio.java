package repositorio;

import java.util.ArrayList;
import modelo.Modelo;

public interface IRepositorio {
    public Modelo Obtener(int id);
    public ArrayList<Modelo> ObtenerTodos();
    public Modelo Añadir(Modelo modelo);
    public void Eliminar(Modelo modelo);
    public void Modificar(Modelo modelo);
}
