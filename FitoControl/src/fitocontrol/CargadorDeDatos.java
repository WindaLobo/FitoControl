package fitocontrol;

import modelo.Articulo;
import modelo.Compra;
import modelo.CompraArticulo;

import modelo.ManoSulfato;
import modelo.ManoSulfatoArticulo;
import modelo.Marca;
import modelo.TipoMedida;
import repositorio.ArticuloRepositorio;
import repositorio.CompraRepositorio;

import repositorio.ManoSulfatoRepositorio;
import repositorio.MarcaRepositorio;

/**
 *
 * @author Windar
 */
public class CargadorDeDatos {

    public final MarcaRepositorio marcaRepo = new MarcaRepositorio();
    public final ArticuloRepositorio articuloRepo = new ArticuloRepositorio();

    public final CompraRepositorio compreaRepo = new CompraRepositorio();
    public final ManoSulfatoRepositorio manoSulfatoRepo = new ManoSulfatoRepositorio();

    public void Cargar() {

        Marca marcaA = new Marca("Marca A");
        Marca marcaB = new Marca("Marca B");
        Marca marcaC = new Marca("Marca C");

        marcaRepo.Añadir(marcaA);
        marcaRepo.Añadir(marcaB);
        marcaRepo.Añadir(marcaC);



        Articulo articulo1 = new Articulo("Articulo 1", TipoMedida.Litros, marcaA.Id);
        Articulo articulo2 = new Articulo("Articulo 2", TipoMedida.Kilos, marcaB.Id);
        Articulo articulo3 = new Articulo("Articulo 3", TipoMedida.Centilitros, marcaC.Id);

        articuloRepo.Añadir(articulo1);
        articuloRepo.Añadir(articulo2);
        articuloRepo.Añadir(articulo3);

        Compra compra = new Compra();
        //CompraArticulo compraArticulo = new CompraArticulo(articulo1.Id, 10, 30);
       // compra.añadirProducto(compraArticulo);
        compreaRepo.Añadir(compra);

        ManoSulfato manoSulfato = new ManoSulfato("12-6-2016");
        
      /*  ManoSulfatoArticulo manoSulfatoArticulo = new ManoSulfatoArticulo(manoSulfato.Id, articulo2.Id, TipoMedida.Centilitros, 6);
        manoSulfato.añadirProducto(manoSulfatoArticulo);
        manoSulfatoRepo.Añadir(manoSulfato);*/

    }

}
