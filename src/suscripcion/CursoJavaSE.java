package suscripcion;

import java.util.ArrayList;
import java.util.List;

public class CursoJavaSE implements Observable {

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void attach(Observer se) {
        observers.add(se);
        notifyUpdate();
    }

    @Override
    public void detach(Observer se) {
        observers.remove(se);

    }

    @Override
    public void notifyUpdate() {
        for (Observer ob: observers) {
            ob.update();
        }
    }
}
