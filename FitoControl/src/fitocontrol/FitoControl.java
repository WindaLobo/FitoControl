package fitocontrol;

import fitocontrol.Menus.MenuArticulos;
import fitocontrol.Menus.MenuCompras;
import fitocontrol.Menus.MenuManosSulfato;
import fitocontrol.Menus.MenuMarcas;
import javax.swing.JOptionPane;

/**
 *
 * @author Windar
 */
public class FitoControl {

    public static void main(String[] args) throws Exception {

        String[] opciones = {"Marcas", "Articulos", "Compras", "Mano Sulfatos", "Salir"};
        String Opcion = "";

        do {
            try {
                Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                switch (Opcion.toUpperCase()) {
                    case "MARCAS":
                        MenuMarcas.mostrar();
                        break;
                    case "ARTICULOS":
                        MenuArticulos.mostrar();
                        break;
                    case "COMPRAS":
                        MenuCompras.Mostrar();
                        break;
                    case "MANO SULFATOS":
                        MenuManosSulfato.mostrar();
                        break;
                    case "SALIR":
                        break;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } while (!Opcion.equalsIgnoreCase("SALIR"));
    }

}
