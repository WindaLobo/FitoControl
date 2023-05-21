package FitoControl.DataBase.modelo;

import java.util.Observable;

public abstract class Modelo extends Observable {
    public int Id;

    @Override
    public String toString() {

        return "Id=" + Id;
    }

}
