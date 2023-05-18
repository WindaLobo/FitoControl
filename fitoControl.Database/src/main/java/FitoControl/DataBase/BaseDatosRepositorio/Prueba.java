package FitoControl.DataBase.BaseDatosRepositorio;

import FitoControl.DataBase.BaseDatosRepositorio.ArticuloBaseDatosRepositorio;
import FitoControl.DataBase.BaseDatosRepositorio.MarcaBaseDatosRepositorio;
import FitoControl.DataBase.modelo.*;

import java.util.Date;

public class Prueba {
    public static void main(String[] args) throws Exception {
     // ArticuloBaseDatosRepositorio articulo = new ArticuloBaseDatosRepositorio();
      //  Articulo ar = new Articulo( 1,"Fugicida", TipoMedida.Gramos,2,5);

     //  articulo.ObtenerTodos();
        /*  //articulo.Añadir(ar);
       // articulo.actualizar(ar);
        articulo.eliminar(ar);
*/
      //  MarcaBaseDatosRepositorio mar= new MarcaBaseDatosRepositorio();
        //Marca marcas = new Marca(4," Pro");
        //mar.ObtenerTodos();
       // mar.añadir(marcas);
       // mar.actualizar(marcas);
        //mar.eliminar(marcas);
        CompraBaseDeDatosRepositorio compraBaseDeDatosRepositorio = new CompraBaseDeDatosRepositorio();
        Compra compra = new Compra(6,new Date());

        CompraArticulo compraarticulo1 = new CompraArticulo(6,6,1,15,18);

   //  compra.añadirArticulo(compraarticulo1);

      // compraBaseDeDatosRepositorio.ObtenerTodos();

       // compraBaseDeDatosRepositorio.añadir(compra);

    compraBaseDeDatosRepositorio.eliminar(compra);





    }
}


