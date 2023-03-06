package fitocontrol.Menus;
import fitocontrol.Repositorio;
import modelo.ManoSulfato;
import modelo.ManoSulfatoArticulo;
import modelo.TipoMedida;

import javax.swing.*;

public class MenuManosSulfato {
    private static final String[] opcionesMenu = {"Añadir", "Obtener Todos", "Volver atras"};

    public static void Mostrar() {
        String Opcion;

        do {
            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion",
              JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

            switch (Opcion.toUpperCase()) {
                case "AÑADIR":
                    añadirManoSulfato();
                    break;
                case "OBTENER TODOS":
                    mostraTodaLasManosDeSulfato();
                    break;
                case "VOLVER ATRAS":
                    break;
            }

        } while (!Opcion.equalsIgnoreCase("Volver atras"));
    }

    public static void añadirManoSulfato() {


        String date = JOptionPane.showInputDialog("Introduce la fecha");
        ManoSulfato manoSulfato = new ManoSulfato(date);
        Repositorio.ManoSulfato.Añadir(manoSulfato);

        int IdManoSulfato = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id de mano sulfato"));
        int IdArticulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id del articulo"));
        TipoMedida tipoMedida = TipoMedida.values()[Integer.parseInt(JOptionPane.showInputDialog("Introduce el tipo de medida \n0--> Litros \n1-->"
          + " Kilos \n2--> Centilitros \n3--> Mililitros"))];

        int  cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad "));
        ManoSulfatoArticulo manoSulfatoArticulo = new ManoSulfatoArticulo(IdManoSulfato, IdArticulo, tipoMedida, cantidad);
       Repositorio.ManoSulfato.Añadir(manoSulfatoArticulo);
    }

    public static void mostraTodaLasManosDeSulfato() {
        System.out.println(Repositorio.ManoSulfato.ObtenerTodos());


    }
}