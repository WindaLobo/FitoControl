
package observers;

import FitoControl.DataBase.modelo.CompraArticulo;
import java.util.Observable;
import java.util.Observer;
import view.CompraArticuloView;

    
public class CompraArticuloObserver  implements Observer{
  private final CompraArticuloView view;
    
    public CompraArticuloObserver(CompraArticuloView view){
        this.view = view;
    }
    
    @Override
    public void update(Observable o, Object arg) {
       view.actualizarView((CompraArticulo) arg);
    }
    
}

