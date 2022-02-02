package reproductor;

public class ReproductorBuilder {

    private String color;
    private int capacity;
    private int duration;

    public ReproductorBuilder setColor(String color){
        this.color = color;
        return this;
    }

    public ReproductorBuilder setCapacity(int capacity){
        this.capacity = capacity;
        return this;
    }

    public ReproductorBuilder setduration(int duration){
        this.duration = duration;
        return this;
    }

    public Reproductor build(){
        return  new Reproductor(color, capacity, duration);
    }
}
