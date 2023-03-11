package fitocontrol.Menus;

import fitocontrol.Repositorio;
import modelo.*;

import javax.swing.*;
import java.util.ArrayList;

import static validaciones.validaciones.validarArticuloEcontrado;
import static validaciones.validaciones.validarCantidadIntroducida;

public class MenuManosSulfato {

    private static final String[] opcionesMenu = {"Añadir", "Obtener Todos", "Volver atras"};
    private static final String[] opcionesMenuCompra = {"Agregar Articulo", "Finalizar"};

    public static void mostrar() throws Exception {
        String Opcion;

        do {
            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion",
                    JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

            if (Opcion == null) {

                Opcion = "";

                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }

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

        ManoSulfato manoSulfato = new ManoSulfato();

        do {

            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion", JOptionPane.QUESTION_MESSAGE, null,
                    opcionesMenuCompra, opcionesMenuCompra[0]);
            if (Opcion == null) {

                Opcion = "";

                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }

            switch (Opcion.toUpperCase()) {

                case "AGREGAR ARTICULO":
                    ManoSulfatoArticulo producto = añadirManoSulfato();
                    manoSulfato.añadirProducto(producto);
                    break;

                case "FINALIZAR":
                    if (manoSulfato.getProductos().size() == 0) {
                        throw new Exception("La manoSulfato no contiene nigun producto");
                    }
                    Repositorio.ManoSulfato.Añadir(manoSulfato);
                    break;
            }
        } while (!Opcion.equalsIgnoreCase("Finalizar"));
    }

    private static void mostraTodaLasManosDeSulfato() {
        JOptionPane.showMessageDialog(null, Repositorio.ManoSulfato.ObtenerTodos());
    }

    private static ManoSulfatoArticulo añadirManoSulfato() throws Exception {
        ArrayList<Modelo> articulos = Repositorio.Articulos.ObtenerTodos();

        int IdArticulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id del articulo" + articulos.toString()));

        TipoMedida tipoMedida = TipoMedida.values()[Integer.parseInt(JOptionPane.showInputDialog("Introduce el tipo de medida \n0--> Litros \n1-->"
                + " Kilos \n2--> Centilitros \n3--> Mililitros"))];

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad "));

        validarCantidadIntroducida(cantidad);

        Modelo articuloEncontrado = validarArticuloEcontrado(IdArticulo, articulos);

        return new ManoSulfatoArticulo((Articulo) articuloEncontrado, tipoMedida, cantidad);
    }


}
