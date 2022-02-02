package suscripcion;

import java.util.ArrayList;
import java.util.List;

public class CursoSpring implements Observable{

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void attach(Observer sp) {
        observers.add(sp);
        notifyUpdate();
    }

    @Override
    public void detach(Observer sp) {
        observers.remove(sp);

    }

    @Override
    public void notifyUpdate() {
        for (Observer sp: observers) {
            sp.update();
        }
    }
}
