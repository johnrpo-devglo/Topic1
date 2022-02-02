package reproductor;

import java.util.StringJoiner;

public class Reproductor {

    private String color;
    private int capacity;
    private int duration;

    public Reproductor() {
    }

    public Reproductor(String color, int capacity, int duration) {
        this.color = color;
        this.capacity = capacity;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Reproductor.class.getSimpleName() + "[", "]")
                .add("color = '" + color + "'")
                .add("capacity = " + capacity + " GB")
                .add("duration = " + duration + " Horas")
                .add("Tiene un precio de: $138000")
                .toString();
    }
}
