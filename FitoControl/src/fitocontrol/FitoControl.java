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
                        MenuCompras.Mostrar();
                        break;
                    case "MANO SULFATOS":
                        MenuManosSulfato.Mostrar();
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
