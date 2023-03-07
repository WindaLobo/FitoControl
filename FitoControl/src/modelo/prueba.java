
package modelo;

/**
 *
 * @author dam1
 */
public class prueba {
  //Attributes
  private Articulo productos[] = null;
  private double  caja;
  
  //Constructors
  public prueba() { 
  }
  public prueba(Articulo[] productos) {
    this.productos = productos;
  }
  
  //Methods
  public Articulo[] cargarProductos() {

    return productos;
  }
  
  public void mostrarProductos(Articulo[] productos) { 
      for (int i = 0; i < productos.length; i++) {
        System.out.print(productos[i]+"");
      }
  }
  public void mostrarNombreProductos(Articulo[] productos) { 
      for (int i = 0; i < productos.length; i++) {
        System.out.println(i+1 +" "+productos[i].getNombre()+"n");
      }
      System.out.println("n------------n");
  }   
  public double comprarProducto(Articulo[] productos, int num, int cantidadUnidades) {
      
    if (productos[num-1].setCantidad(8.5)) {
      if (productos[num-1].getCantidad()>= cantidadUnidades){
        System.out.println("La compra se ha realizado con éxito!!n");
        productos[num -1].setCantidad(productos[num -1].getCantidad()-cantidadUnidades);
        return caja+=cantidadUnidades*productos[num-1].getCantidad();
      } else {System.out.println("No hay cantidad suficiente de producto");}
    } else {System.out.println("No hay cantidad suficiente de producto");}
    return caja;
  }
  public double mostrarCaja() {
    System.out.print("El total de la caja es ");
    caja=Math.round(caja*100);
    return caja/100;
  } 
}
    

