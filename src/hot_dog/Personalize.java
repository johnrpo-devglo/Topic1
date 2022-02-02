package hot_dog;

public class Personalize extends AdditionsHotdog{

    public Personalize(Additions adds){
        super(adds);
    }

    @Override
    public void simple() {
        adds.simple();
        setSimple(adds);
    }

    @Override
    public void sauces() {
        adds.sauces();
        setSauces(adds);
    }

    @Override
    public void combo() {
        adds.combo();
        setCombo(adds);
    }

    @Override
    public void chips() {
        adds.chips();
        setChips(adds);

    }

    @Override
    public void pineapple() {
        adds.pineapple();
        setPineapple(adds);

    }

    @Override
    public void bacon() {
        adds.bacon();
        setBacon(adds);

    }

    @Override
    public void cheese() {
        adds.cheese();
        setCheese(adds);

    }

    private void setSimple(Additions adds){
        System.out.println("Hotdog simple");
    }

    private void setSauces(Additions adds){
        System.out.println("Salsas agregadas");
    }

    private void setCombo(Additions adds){
        System.out.println("Agrandado en combo");
    }

    private void setChips(Additions adds){
        System.out.println("Se agregaron papas trituradas");
    }

    private void setPineapple(Additions adds){
        System.out.println("Se agrregaron piña en trozos");
    }

    private void setBacon(Additions adds){
        System.out.println("Se agrego tocineta");
    }

    private void setCheese(Additions adds){
        System.out.println("Adicion de doble queso");
    }



}
