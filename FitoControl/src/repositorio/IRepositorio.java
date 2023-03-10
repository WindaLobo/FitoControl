package repositorio;

import java.util.ArrayList;
import modelo.Modelo;

public interface IRepositorio {

    public Modelo Obtener(int id) throws Exception;

    public ArrayList<Modelo> ObtenerTodos();

    public Modelo Añadir(Modelo modelo) throws Exception;

    public void Eliminar(Modelo modelo);

    public void Modificar(Modelo modelo) throws Exception;
}
