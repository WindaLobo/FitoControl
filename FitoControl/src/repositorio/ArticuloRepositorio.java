package repositorio;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Articulo;
import modelo.Modelo;
import modelo.TipoMedida;

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
    public Modelo Añadir(Modelo articulo) throws IOException {

        if (!Articulos.isEmpty()) {

            Modelo last = Articulos.get(Articulos.size() - 1);

            articulo.Id = last.Id + 1;

        } else {

            articulo.Id = 1;
        }
        Articulos.add(articulo);

        guardarEnFichero();

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

    @Override
    public void cargarDesdeFichero() throws FileNotFoundException {
        File archivo = new File("Articulo.txt");
        Scanner scanner = new Scanner(archivo);
        try {
            while (scanner.hasNextLine()) {
                String[] split = scanner.nextLine().split(",");
                Articulos.add(new Articulo(Integer.parseInt(split[0]), split[1], TipoMedida.values()[Integer.parseInt(split[2])], Integer.parseInt(split[3]), Double.parseDouble(split[4])));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }
    }

    @Override
    public void guardarEnFichero() throws IOException {
        File fichero = new File("Articulo.txt");
        FileWriter fileWriter = new FileWriter(fichero, false);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (Modelo articulo : Articulos) {
            printWriter.println(((Articulo) articulo).toStringFichero());

        }
        fileWriter.close();

    }

}
