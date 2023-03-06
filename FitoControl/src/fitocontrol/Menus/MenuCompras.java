package fitocontrol.Menus;

import fitocontrol.Repositorio;
import modelo.Compra;
import modelo.CompraArticulo;
import modelo.Modelo;
import javax.swing.*;
import java.util.ArrayList;
import modelo.Articulo;

public class MenuCompras {

    private static final String[] opcionesMenu = {"Añadir", "Obtener Todos", "Volver atras"};
    private static final String[] opcionesMenuCompra = {"Agregar Compra", "Finalizar Compra"};

    public static void Mostrar() throws Exception {
        String Opcion;

        do {
            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion", JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

            switch (Opcion.toUpperCase()) {
                case "AÑADIR":
                    opcionesMenuCompras();
                    break;
                case "OBTENER TODOS":
                    mostraTodaLasCompras();
                    break;
                case "VOLVER ATRAS":
                    break;
            }

        } while (!Opcion.equalsIgnoreCase("Volver atras"));
    }

    private static void opcionesMenuCompras() throws Exception {
        String Opcion;
        do {

            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion", JOptionPane.QUESTION_MESSAGE, null,
                    opcionesMenuCompra, opcionesMenuCompra[0]);

            switch (Opcion.toUpperCase()) {

                case "AGREGAR COMPRA":
                    añadirCompra();
                    break;

                case "FINALIZAR COMPRA":
                    break;
            }
        } while (!Opcion.equalsIgnoreCase("Finalizar Compra"));
    }

    private static void mostraTodaLasCompras() {
        JOptionPane.showMessageDialog(null, Repositorio.Compra.ObtenerTodos());

    }

    private static void añadirCompra() throws Exception {
        ArrayList<Modelo> articulos = Repositorio.Articulos.ObtenerTodos();
        Compra compras = new Compra();

        int idArticulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id del articulo " + articulos.toString()));

        double cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad "));

        double precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio "));

        Modelo articuloEncontrado = null;
        for (Modelo articulo : articulos) {
            if (articulo.Id == idArticulo) {
                articuloEncontrado = articulo;
                break;
            }
        }

        if (articuloEncontrado == null) {
            throw new Exception("Articulo seleccionado no existe ");
        }

        CompraArticulo compraArticulo = new CompraArticulo((Articulo) articuloEncontrado, cantidad, precio);

        compras.añadirProducto(compraArticulo);

        Repositorio.Compra.Añadir(compras);

        JOptionPane.showMessageDialog(null, "Compra creado correctamente.");

    }

}
