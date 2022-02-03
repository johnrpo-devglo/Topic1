package hotdog;

public class Simple extends AddToHotdog{

    public Simple(Add sum){
        super(sum);
    }

    public void add(){
        sum.add();
        setSimple(sum);
    }

    private void setSimple(Add sum){
        System.out.println("Hotdog simple, solo Pan y Salchicha");
    }
}
