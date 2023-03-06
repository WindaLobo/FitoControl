package fitocontrol.Menus;

import fitocontrol.Repositorio;
import modelo.Compra;
import modelo.CompraArticulo;
import modelo.Modelo;

import javax.swing.*;
import java.util.ArrayList;

public class MenuCompras {
    private static final String[] opcionesMenu = {"Añadir", "Obtener Todos", "Volver atras"};

    public static void Mostrar() {
        String Opcion;

        do {
            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion", JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

            switch (Opcion.toUpperCase()) {
                case "AÑADIR":
                    añadirCompra();
                    break;
                case "OBTENER TODOS":
                    mostraTodaLasCompras();
                    break;
                case "VOLVER ATRAS":
                    break;
            }

        } while (!Opcion.equalsIgnoreCase("Volver atras"));
    }

    public static void añadirCompra() {
        ArrayList<Modelo> compra = Repositorio.Compra.ObtenerTodos();

        /*int IdArticulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id del articulo " +compra.toString()));
        double  cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad "));
        double precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio "));*/

        Compra compraArticulo = new Compra();
        Repositorio.Compra.Añadir(compraArticulo);
        JOptionPane.showMessageDialog(null, "Compra creado correctamente");
    }

    public static void mostraTodaLasCompras() {
        Repositorio.Compra.ObtenerTodos();

    }

}
