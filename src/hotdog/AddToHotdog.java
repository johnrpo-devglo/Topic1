package hotdog;

public abstract class AddToHotdog implements Add{

    protected Add sum;

    public AddToHotdog(Add sum){
        this.sum = sum;
    }

    public void add(){
        sum.add();
    }
}
