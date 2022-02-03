package hotdog;

public class Chips extends AddToHotdog{

    public Chips(Add sum){
        super(sum);
    }

    public void add(){
        sum.add();
        setChips(sum);
    }

    private void setChips(Add sum){
        System.out.println("Se agregaron papas trituradas");
    }
}
