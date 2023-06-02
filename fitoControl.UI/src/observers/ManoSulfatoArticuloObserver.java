
package observers;

import FitoControl.DataBase.modelo.ManoSulfatoArticulo;
import java.util.Observable;
import java.util.Observer;
import view.ManoSulfatoArticuloView;

public class ManoSulfatoArticuloObserver  implements Observer {
   

    private final ManoSulfatoArticuloView view;
    
    public ManoSulfatoArticuloObserver(ManoSulfatoArticuloView view){
        this.view = view;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        view.actualizarView((ManoSulfatoArticulo) arg);
    }
}
    

