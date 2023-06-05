
package observers;

import FitoControl.DataBase.modelo.Articulo;
import java.util.Observable;
import java.util.Observer;
import view.ArticuloView;


public class ArticuloObserver  implements Observer{
  private final ArticuloView view;
    
    public ArticuloObserver(ArticuloView view){
        this.view = view;
    }
    
    @Override
    public void update(Observable o, Object arg) {
       view.actualizarView((Articulo) arg);
    }
    
   }
