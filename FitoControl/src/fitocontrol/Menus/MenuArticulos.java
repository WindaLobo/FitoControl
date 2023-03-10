package fitocontrol.Menus;
import fitocontrol.Repositorio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Articulo;
import modelo.Modelo;
import modelo.TipoMedida;

public class MenuArticulos {
    private static final String[] opcionesMenu = {"Añadir", "Obtener Todos", "Volver atras"};
    public static void mostrar() throws Exception {
        String Opcion;

        do {
            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion",
                    JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

            switch (Opcion.toUpperCase()) {
                case "AÑADIR":
                    añadirArticulos();
                    break;
                case "OBTENER TODOS":
                    mostraTodoLosArticulo();
                    break;
                case "VOLVER ATRAS":
                    break;
            }

        } while (!Opcion.equalsIgnoreCase("Volver atras"));
    }
    private static void añadirArticulos() throws Exception {

        ArrayList<Modelo> marcas = Repositorio.Marcas.ObtenerTodos();

        String nombre = JOptionPane.showInputDialog("Introduce el nombre de la articulo");
          validarnombre( nombre );

        TipoMedida tipoMedida = TipoMedida.values()[Integer.parseInt(JOptionPane.showInputDialog("Introduce el tipo de medida \n0--> Litros \n1-->"
                + " Kilos \n2--> Centilitros \n3--> Mililitros"))];

        int IdDeMarca = Integer.parseInt(JOptionPane.showInputDialog(" Introduce el Id de Marca " + marcas.toString()));
        validarIdMarca(IdDeMarca,marcas);

        Articulo articulo = new Articulo(nombre, tipoMedida, IdDeMarca);

        Repositorio.Articulos.Añadir(articulo);

        JOptionPane.showMessageDialog(null, "Articulo creado correctamente.");
    }
    private static void mostraTodoLosArticulo() {

        JOptionPane.showMessageDialog(null, Repositorio.Articulos.ObtenerTodos());
    }

    private static void validarnombre(String nombre) throws Exception {
        if (nombre.isEmpty() ) {
            throw new Exception("No has añadido ninguna Articulo");
        }
    }
    private static void validarIdMarca(int IdDeMarca,  ArrayList<Modelo> marcas ) throws Exception {
        Modelo marcaEncontrado = null;
        for (Modelo marca : marcas) {
            if (marca.Id == IdDeMarca) {
                marcaEncontrado = marca;
                break;
            }
        }
        if (marcaEncontrado == null) {
            throw new Exception("Articulo seleccionado no existe ");
        }
    }

}

