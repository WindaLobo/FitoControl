package fitocontrol;



/**
 *
 * @author Windar
 */
public class FitoControl {

    public static void main(String[] args) throws Exception {

        CargadorDeDatos cargador = new CargadorDeDatos();
        cargador.Cargar();

        var producto = cargador.articuloRepo.Obtener(2);
         
        
       
    }

}
