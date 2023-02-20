
package fitocontrol;

import modelo.Articulo;
import modelo.Compra;
import modelo.Modelo;
import repositorio.ArticuloRepositorio;
import repositorio.CompraRepositorio;

/**
 *
 * @author Windar
 */
public class FitoControl {
    public static void main(String[] args) {
        // TODO code application logic here
      /* ArticuloRepositorio articuloRepo = new ArticuloRepositorio();
        
        Articulo articulo1 = new Articulo();
        Articulo articulo2 = new Articulo();
        Articulo articulo3 = new Articulo();
        
            articuloRepo.Añadir(articulo1);
        articuloRepo.Añadir(articulo2);
        articuloRepo.Añadir(articulo3);
        
        var todos = articuloRepo.ObtenerTodos();*/
       
       CompraRepositorio compra = new CompraRepositorio();
       Compra compra1= new Compra();
       Compra compra2= new Compra();
       compra.Añadir(compra1);
        compra.Añadir(compra2);
        var todos = compra.ObtenerTodos();
       
        
        for(Modelo modelo : todos){
            System.out.println(modelo);
        }
        
    }
    
}
