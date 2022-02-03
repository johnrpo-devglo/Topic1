package hotdog;

public class Pineapple extends AddToHotdog{

    public Pineapple(Add sum){
        super(sum);
    }

    public void add(){
        sum.add();
        setPineapple(sum);
    }

    private void setPineapple(Add sum){
        System.out.println("Se agregaron piña en trozos");
    }
}
