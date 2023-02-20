/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fitocontrol;

import modelo.Articulo;
import modelo.Modelo;
import repositorio.ArticuloRepositorio;

/**
 *
 * @author Windar
 */
public class FitoControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArticuloRepositorio articuloRepo = new ArticuloRepositorio();
        
        Articulo articulo1 = new Articulo();
        Articulo articulo2 = new Articulo();
        Articulo articulo3 = new Articulo();
        
       /*articuloRepo.Añadir(articulo1);
        articuloRepo.Añadir(articulo2);
        articuloRepo.Añadir(articulo3);*/
        
        var todos = articuloRepo.ObtenerTodos();
        
        for(Modelo modelo : todos){
            System.out.println(modelo);
        }
        
    }
    
}
