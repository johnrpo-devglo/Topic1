package suscripcion;

public class Observador {

    public static void main(String[] args) {
        System.out.println("---Tienda en linea---");
        Usuario1 user = new Usuario1();
        CursoJavaSE discount = new CursoJavaSE();
        discount.attach(user);

        System.out.println("\n");

        System.out.println("---Tienda en linea---");
        Usuario2 user2= new Usuario2();
        CursoJavaEE Promo = new CursoJavaEE();
        Promo.attach(user2);

        System.out.println("\n");

        System.out.println("---Tienda en linea---");
        Usuario3 user3 = new Usuario3();
        CursoSpring bf = new CursoSpring();
        bf.attach(user3);

    }

}
