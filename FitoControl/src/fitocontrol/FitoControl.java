package fitocontrol;

import fitocontrol.Menus.MenuArticulos;
import fitocontrol.Menus.MenuMarcas;
import javax.swing.JOptionPane;

/**
 *
 * @author Windar
 */
public class FitoControl {

    public static void main(String[] args) throws Exception {

        String[] opciones = {"Marcas", "Articulos", "Compras", "Mano sulfatos", "Salir"};
        String Opcion = "";

        do {
            try {
                Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                switch (Opcion.toUpperCase()) {
                    case "MARCAS":
                        MenuMarcas.Mostrar();
                        break;
                    case "ARTICULOS":
                        MenuArticulos.Mostrar();
                        break;
                    case "COMPRAS":
                        // Mostrar.MenuCompras();
                        break;
                    case "MANO SULFATO":
                        //  Mostrar.MenuManosSulfato();
                        break;
                    case "SALIR":
                        break;
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while (!Opcion.equalsIgnoreCase("SALIR"));
    }

}
