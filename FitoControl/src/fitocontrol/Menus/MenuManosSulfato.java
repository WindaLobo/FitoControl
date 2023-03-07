package fitocontrol.Menus;

import fitocontrol.Repositorio;
import modelo.ManoSulfato;
import modelo.ManoSulfatoArticulo;
import modelo.Modelo;
import modelo.TipoMedida;

import javax.swing.*;
import java.util.ArrayList;
import modelo.Articulo;

public class MenuManosSulfato {

    private static final String[] opcionesMenu = {"Añadir", "Obtener Todos", "Volver atras"};
    private static final String[] opcionesMenuCompra = {"Agregar ManoSulfato", "Finalizar "};

    public static void Mostrar() throws Exception {
        String Opcion;

        do {
            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion",
                    JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

            switch (Opcion.toUpperCase()) {
                case "AÑADIR":
                    opcionesMenuManoDeSulfato();
                    break;
                case "OBTENER TODOS":
                    mostraTodaLasManosDeSulfato();
                    break;
                case "VOLVER ATRAS":
                    break;
            }

        } while (!Opcion.equalsIgnoreCase("Volver atras"));
    }

    private static void opcionesMenuManoDeSulfato() throws Exception {
        String Opcion;
        do {

            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion", JOptionPane.QUESTION_MESSAGE, null,
                    opcionesMenuCompra, opcionesMenuCompra[0]);

            switch (Opcion.toUpperCase()) {

                case "AGREGAR MANOSULFATO":
                    añadirManoSulfato();
                    break;

                case "FINALIZAR ":
                    break;
            }
        } while (!Opcion.equalsIgnoreCase("Finalizar "));
    }

    private static void añadirManoSulfato() throws Exception {
        ArrayList<Modelo> articulos = Repositorio.Articulos.ObtenerTodos();

        String date = JOptionPane.showInputDialog("Introduce la fecha");

        ManoSulfato manosSulfato = new ManoSulfato(date);

        int IdArticulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id del articulo" + articulos.toString()));

        TipoMedida tipoMedida = TipoMedida.values()[Integer.parseInt(JOptionPane.showInputDialog("Introduce el tipo de medida \n0--> Litros \n1-->"
                + " Kilos \n2--> Centilitros \n3--> Mililitros"))];

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad "));

   

        Modelo articuloEncontrado = null;
        for (Modelo articulo : articulos) {
            if (articulo.Id == IdArticulo) {
                articuloEncontrado = articulo;
                break;
            }
        }
        if (articuloEncontrado == null) {
            throw new Exception("Articulo seleccionado no existe ");
        }

        ManoSulfatoArticulo manoSulfatoArticulo = new ManoSulfatoArticulo((Articulo) articuloEncontrado, tipoMedida, cantidad);

        manosSulfato.añadirProducto(manoSulfatoArticulo);

        Repositorio.ManoSulfato.Añadir(manosSulfato);
    }

    private static void mostraTodaLasManosDeSulfato() {
        JOptionPane.showMessageDialog(null, Repositorio.ManoSulfato.ObtenerTodos());

    }
}
