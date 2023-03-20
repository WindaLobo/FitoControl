package repositorio;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;

public class ManoSulfatoRepositorio implements IRepositorio {
    private final ArrayList<Modelo> ManosSulfato = new ArrayList<>();

    @Override
    public Modelo Añadir(Modelo modelo) throws Exception {

        ManoSulfato manoSulfato = (ManoSulfato) modelo;

        if (!ManosSulfato.isEmpty()) {

            Modelo last = ManosSulfato.get(ManosSulfato.size() - 1);

            manoSulfato.Id = last.Id + 1;

        } else {
            manoSulfato.Id = 1;
        }
        int detalleManoSulfatoId = 0;

        for (ManoSulfatoArticulo detalleManoSulfato : manoSulfato.getArticulos()) {

            detalleManoSulfato.Id = ++detalleManoSulfatoId;

            detalleManoSulfato.setIdManoSulfato(manoSulfato.Id);

            Articulo articulo = detalleManoSulfato.getArticulo();

            if (articulo.getCantidad() - detalleManoSulfato.getCantidad() < 0) {

                throw new Exception("No puedes aplicar mano sulfato por que no tienes suficiente stock");

            } else {

                articulo.setCantidad(articulo.getCantidad() - detalleManoSulfato.getCantidad());
            }
        }

        ManosSulfato.add(manoSulfato);

        return manoSulfato;
    }

    @Override
    public ArrayList<Modelo> ObtenerTodos() {

        return ManosSulfato;
    }

    @Override
    public void cargarDesdeFichero() throws FileNotFoundException {
        File archivo = new File("Manosulfato.txt");
        Scanner scanner = new Scanner(archivo);
        try {
            while (scanner.hasNextLine()) {
                String[] split = scanner.nextLine().split(",");
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                ManosSulfato.add(new ManoSulfato(Integer.parseInt(split[0]), formatoFecha.parse(split[1])));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }

        ArrayList<Modelo> ManoSulfatoArticulo = new ArrayList<>();
        archivo = new File("ManosulfatoArticulo.txt");
        scanner = new Scanner(archivo);
        try {
            while (scanner.hasNextLine()) {
                String[] split = scanner.nextLine().split(",");
                ManoSulfatoArticulo.add(new ManoSulfatoArticulo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), TipoMedida.values()[Integer.parseInt(split[3])], Integer.parseInt(split[4])));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }

        for (Modelo recorrerManoSulfato : ManosSulfato) {
            ManoSulfato manosSulfato = (ManoSulfato) recorrerManoSulfato;
            for (Modelo detalleDeManoSulfatoArticulo : ManoSulfatoArticulo) {
                ManoSulfatoArticulo manoSulfatoArticulo = (ManoSulfatoArticulo) detalleDeManoSulfatoArticulo;
                if (manosSulfato.Id == manoSulfatoArticulo.getIdManoSulfato()) {
                    manosSulfato.añadirArticulo(manoSulfatoArticulo);
                }
            }
        }


    }

    @Override
    public void guardarEnFichero() throws IOException {
        File fichero = new File("Manosulfato.txt");
        FileWriter fileWriter = new FileWriter(fichero, false);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (Modelo manoSulfato : ManosSulfato) {
            printWriter.println(((ManoSulfato) manoSulfato).toStringFichero());

        }
        fileWriter.close();

        fichero = new File("ManosulfatoArticulo.txt");
        fileWriter = new FileWriter(fichero, false);
        printWriter = new PrintWriter(fileWriter);
        for (Modelo manoSulfato : ManosSulfato) {
            for (Modelo detalleManoSulfato : ((ManoSulfato) manoSulfato).getArticulos()) {
                printWriter.println(((ManoSulfatoArticulo) detalleManoSulfato).toStringFichero());

            }

        }
        fileWriter.close();

    }
}
