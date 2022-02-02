package hot_dog;

public abstract class AdditionsHotdog implements Additions{

    protected Additions adds;

    public AdditionsHotdog(Additions adds){
        this.adds = adds;
    }

    public void sauces(){
        adds.sauces();
    }

    public void combo() {
        adds.combo();
    }

    public void chips(){
        adds.chips();
    }

    public void pineapple(){
        adds.pineapple();
    }

    public void bacon() {
        adds.bacon();
    }

    public void cheese() {
        adds.cheese();
    }
}
