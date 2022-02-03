package hotdog;

public class Bacon extends AddToHotdog{

    public Bacon(Add sum){
        super(sum);
    }

    public void add(){
        sum.add();
        setBacon(sum);
    }

    private void setBacon(Add sum){
        System.out.println("Se agregó tocineta");
    }
}
