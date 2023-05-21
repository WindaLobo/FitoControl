
package observers;

import FitoControl.DataBase.modelo.Marca;
import java.util.Observable;
import java.util.Observer;
import view.MarcaView;


public class MarcaObserver implements Observer {

    private final MarcaView view;
    
    public MarcaObserver(MarcaView view){
        this.view = view;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        view.actualizarView((Marca) arg);
    }
}
