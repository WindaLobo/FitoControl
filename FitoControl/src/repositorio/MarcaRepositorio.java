package repositorio;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import fitocontrol.Repositorio;
import modelo.Marca;
import modelo.Modelo;

/**
 * @author Windar
 */
public class MarcaRepositorio implements IRepositorio {

    private final ArrayList<Modelo> Marcas = new ArrayList<>();

    @Override
    public Modelo Obtener(int id) throws Exception {

        for (Modelo marca : Marcas) {

            if (marca.Id == id) {

                return marca;
            }
        }
        throw new Exception(" Marca no encontrado");
    }

    @Override
    public Modelo Añadir(Modelo marca) throws IOException {

        if (!Marcas.isEmpty()) {

            Modelo last = Marcas.get(Marcas.size() - 1);

            marca.Id = last.Id + 1;
        } else {

            marca.Id = 1;
        }
        Marcas.add(marca);

        guardarEnFichero();

        return marca;
    }

    @Override
    public void Eliminar(Modelo marca) {

        Marcas.remove(marca);
    }

    @Override
    public void Modificar(Modelo marca) {

        int index = Marcas.indexOf(marca);

        if (index > -1) {

            Marcas.set(index, marca);
        }
    }


    @Override
    public ArrayList<Modelo> ObtenerTodos() {

        return Marcas;
    }

    @Override
    public void cargarDesdeFichero() throws FileNotFoundException {
        File archivo = new File("Marca.txt");
        Scanner scanner = new Scanner(archivo);
        try {
            while (scanner.hasNextLine()) {
                String[] split = scanner.nextLine().split(",");
                Marcas.add(new Marca(Integer.parseInt(split[0]), split[1]));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }
    }

    @Override
    public void guardarEnFichero() throws IOException {
        File fichero = new File("Marca.txt");
        FileWriter fileWriter = new FileWriter(fichero, false);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (Modelo marca : Marcas) {
            printWriter.println(((Marca)marca).toStringFichero());

        }
        fileWriter.close();

    }


}
