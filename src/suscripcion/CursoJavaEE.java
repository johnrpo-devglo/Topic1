package suscripcion;

import java.util.ArrayList;
import java.util.List;

public class CursoJavaEE implements Observable{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer ee) {
        observers.add(ee);
        notifyUpdate();
    }

    @Override
    public void detach(Observer ee) {
        observers.remove(ee);
        System.out.println("Acabas de darte de baja");


    }

    @Override
    public void notifyUpdate() {
        for (Observer ee: observers) {
            ee.update();
        }
    }
}
