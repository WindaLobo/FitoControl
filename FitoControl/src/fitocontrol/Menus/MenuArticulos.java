package fitocontrol.Menus;

import fitocontrol.Repositorio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Articulo;
import modelo.Modelo;
import modelo.TipoMedida;

public class MenuArticulos {

    private static final String[] opcionesMenu = {"Añadir", "Obtener Todos", "Volver atras"};
    private static final String[] opcionesMenuCompra = {"Agregar producto", "Finalizar "};

    public static void Mostrar() throws Exception {
        String Opcion;

        do {
            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion",
                    JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

            switch (Opcion.toUpperCase()) {
                case "AÑADIR":
                    opcionesMenuArticulo();
                    break;
                case "OBTENER TODOS":
                    mostraTodoLosArticulo();
                    break;
                case "VOLVER ATRAS":
                    break;
            }

        } while (!Opcion.equalsIgnoreCase("Volver atras"));
    }

    private static void opcionesMenuArticulo() throws Exception {
        String Opcion;
        do {

            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion", JOptionPane.QUESTION_MESSAGE, null,
                    opcionesMenuCompra, opcionesMenuCompra[0]);

            switch (Opcion.toUpperCase()) {

                case "AGREGAR PRODUCTO":
                    añadirArticulos();
                    break;

                case "FINALIZAR":
                    break;
            }
        } while (!Opcion.equalsIgnoreCase("Finalizar "));
    }

    private static void añadirArticulos() {
        ArrayList<Modelo> marcas = Repositorio.Marcas.ObtenerTodos();

        String nombre = JOptionPane.showInputDialog("Introduce el nombre de la articulo");

        TipoMedida tipoMedida = TipoMedida.values()[Integer.parseInt(JOptionPane.showInputDialog("Introduce el tipo de medida \n0--> Litros \n1-->"
                + " Kilos \n2--> Centilitros \n3--> Mililitros"))];

        int IdDeMarca = Integer.parseInt(JOptionPane.showInputDialog(" Introduce el Id de Marca " + marcas.toString()));

        Articulo articulo = new Articulo(nombre, tipoMedida, IdDeMarca);

        Repositorio.Articulos.Añadir(articulo);

        JOptionPane.showMessageDialog(null, "Articulo creado correctamente.");
    }

    private static void mostraTodoLosArticulo() {

        JOptionPane.showMessageDialog(null, Repositorio.Articulos.ObtenerTodos());
    }
}
