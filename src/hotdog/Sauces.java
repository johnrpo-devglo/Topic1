package hotdog;

public class Sauces extends AddToHotdog{

    public Sauces(Add sum){
        super(sum);
    }

    public void add(){
        sum.add();
        setSauces(sum);
    }

    private void setSauces(Add sum){
        System.out.println("Se agregaron todas las salsas");
    }
}
