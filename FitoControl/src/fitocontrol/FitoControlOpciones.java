package fitocontrol;
public class FitoControlOpciones {

    private static String nombre;
    private static int IdArticulo;

    private static int cantidad;

   // public static CompraRepositorio compreaRepo = new CompraRepositorio();
   // public static ManoSulfatoRepositorio manoSulfatoRepo = new ManoSulfatoRepositorio();


    /*  
    public static void añadirCompra() {
        Compra compra = new Compra();
        IdArticulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id del articulo"));
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad "));
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio "));
        CompraArticulo compraArticulo = new CompraArticulo(IdArticulo, cantidad, precio);
        compra.añadirProducto(compraArticulo);
        JOptionPane.showMessageDialog(null,compreaRepo.Añadir(compra));
    }

    public static void mostraTodaLasCompras() {
        compreaRepo.ObtenerTodos();

    }

    public static void añadirManoSulfato() {
        String date = JOptionPane.showInputDialog("Introduce la fecha");
        ManoSulfato manoSulfato = new ManoSulfato(date);
        int IdManoSulfato = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id de mano sulfato"));
        IdArticulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id del articulo"));
        tipoMedida = TipoMedida.valueOf(JOptionPane.showInputDialog("Introduce el tipo de medida "));
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad "));
        ManoSulfatoArticulo manoSulfatoArticulo = new ManoSulfatoArticulo(IdManoSulfato, IdArticulo, tipoMedida, cantidad);
        manoSulfato.añadirProducto(manoSulfatoArticulo);
        manoSulfatoRepo.Añadir(manoSulfato);
    }

    public static void mostraTodaLasManosDeSulfato() {
        manoSulfatoRepo.ObtenerTodos();

    }*/
}
