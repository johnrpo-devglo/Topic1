package suscripcion;

public class Usuario1 implements Observer{

    @Override
    public void update() {
        System.out.println("Aprovecha!, Este curso tiene descuento del 80% ☕");
    }
}
