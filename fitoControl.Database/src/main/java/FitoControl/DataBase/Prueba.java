package FitoControl.DataBase;

import FitoControl.DataBase.BaseDatosRepositorio.ArticuloBaseDatosRepositorio;
import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.TipoMedida;

public class Prueba {
    public static void main(String[] args) throws Exception {
        ArticuloBaseDatosRepositorio articulo = new ArticuloBaseDatosRepositorio();
        Articulo ar = new Articulo( "fungicida", TipoMedida.Gramos,1);

        articulo.ObtenerTodos();
        articulo.Añadir(ar);


    }
}


