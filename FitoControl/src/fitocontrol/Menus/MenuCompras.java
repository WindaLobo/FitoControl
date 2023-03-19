package fitocontrol.Menus;

import fitocontrol.Repositorio;
import modelo.Compra;
import modelo.CompraArticulo;
import modelo.Modelo;

import javax.swing.*;
import java.util.ArrayList;

import modelo.Articulo;

import static validaciones.validaciones.*;

public class MenuCompras {
    private static final String[] opcionesMenu = {"Añadir", "Obtener Todos", "Volver atras"};
    private static final String[] opcionesMenuCompra = {"Agregar Articulo", "Finalizar Compra"};

    public static void mostrar() throws Exception {
        String Opcion;

        do {
            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion", JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);
            if (Opcion == null) {

                Opcion = "";

                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
            switch (Opcion.toUpperCase()) {
                case "AÑADIR":
                    opcionesAñadirCompra();
                    break;
                case "OBTENER TODOS":
                    mostraTodaLasCompras();
                    break;
                case "VOLVER ATRAS":
                    break;
            }
        } while (!Opcion.equalsIgnoreCase("Volver atras"));
    }

    private static void opcionesAñadirCompra() throws Exception {
        String Opcion;

        Compra compra = new Compra();

        do {
            Opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opcion", "Opcion", JOptionPane.QUESTION_MESSAGE, null,
                    opcionesMenuCompra, opcionesMenuCompra[0]);

            if (Opcion == null) {

                Opcion = "";

                JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
            switch (Opcion.toUpperCase()) {

                case "AGREGAR ARTICULO":
                    CompraArticulo detalleCompra = añadirArticulo();

                    validarCompraDetalle(compra, detalleCompra);

                    compra.añadirProducto(detalleCompra);
                    break;

                case "FINALIZAR COMPRA":
                    if (compra.getArticulos().size() == 0) {
                        throw new Exception("La compra no contiene nigun articulo");
                    }
                    Repositorio.Compra.Añadir(compra);
                    Repositorio.Compra.guardarEnFichero();
                    Repositorio.Articulos.guardarEnFichero();
                    break;
            }
        } while (!Opcion.equalsIgnoreCase("Finalizar Compra"));
    }

    private static void mostraTodaLasCompras() {
        JOptionPane.showMessageDialog(null, Repositorio.Compra.ObtenerTodos());
    }

    private static CompraArticulo añadirArticulo() throws Exception {
        ArrayList<Modelo> articulos = Repositorio.Articulos.ObtenerTodos();

        int idArticulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id del articulo " + articulos.toString()));

        double cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad "));

        validarCantidadIntroducida(cantidad);

        double precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio "));

        Modelo articuloEncontrado = validarArticuloEcontrado(idArticulo, articulos);

        return new CompraArticulo((Articulo) articuloEncontrado, cantidad, precio);

    }


}
