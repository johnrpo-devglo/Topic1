package reproductor;

import java.util.Scanner;

public class Builder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el color del reproductor (Verde o azul)");
        String color = sc.nextLine();
        System.out.println("Capacidad de memoria 8 o 16 GB");
        int capacity = sc.nextInt();
        System.out.println("Duracion de bateria 5 u 8 horas");
        int duration = sc.nextInt();

        Reproductor reproductor = new ReproductorBuilder()
                .setColor(color)
                .setCapacity(capacity)
                .setduration(duration)
                .build();
        System.out.println(reproductor);
    }
}
