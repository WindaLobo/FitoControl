package FitoControl.DataBase.ficherosRepositorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import FitoControl.DataBase.modelo.Modelo;

public interface IRepositorio {
    public ArrayList<Modelo> ObtenerTodos();

    public Modelo Añadir(Modelo modelo) throws Exception;

    public void cargarDesdeFichero() throws FileNotFoundException;

    public void guardarEnFichero() throws IOException;

}
