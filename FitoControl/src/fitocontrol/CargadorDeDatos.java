package fitocontrol;

import modelo.Articulo;
import modelo.Compra;
import modelo.Inventario;
import modelo.Marca;
import modelo.TipoMedida;
import repositorio.ArticuloRepositorio;
import repositorio.CompraRepositorio;
import repositorio.InventarioRepositorio;
import repositorio.MarcaRepositorio;

/**
 *
 * @author Windar
 */
public class CargadorDeDatos {

    public final MarcaRepositorio marcaRepo = new MarcaRepositorio();
    public final ArticuloRepositorio articuloRepo = new ArticuloRepositorio();
    public final InventarioRepositorio inventarioRepo = new InventarioRepositorio();
    public final CompraRepositorio compreaRepo = new CompraRepositorio();

    public void Cargar() {

        Marca marcaA = new Marca("Marca A");
        Marca marcaB = new Marca("Marca B");
        Marca marcaC = new Marca("Marca C");

        marcaRepo.Añadir(marcaA);
        marcaRepo.Añadir(marcaB);
        marcaRepo.Añadir(marcaC);

        Inventario inventario1 = new Inventario(0);
        Inventario inventario2 = new Inventario(0);
        Inventario inventario3 = new Inventario(0);

        inventarioRepo.Añadir(inventario1);
        inventarioRepo.Añadir(inventario2);
        inventarioRepo.Añadir(inventario3);

        Articulo articulo1 = new Articulo(5, "Articulo 1", inventario1.Id, TipoMedida.Litros, marcaA.Id);
        Articulo articulo2 = new Articulo(3, "Articulo 2", inventario2.Id, TipoMedida.Kilos, marcaB.Id);
        Articulo articulo3 = new Articulo(2, "Articulo 3", inventario3.Id, TipoMedida.Centilitros, marcaC.Id);

        articuloRepo.Añadir(articulo1);
        articuloRepo.Añadir(articulo2);
        articuloRepo.Añadir(articulo3);

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();
        Compra compra3 = new Compra();
     
    }
}
