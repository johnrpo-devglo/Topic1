package hot_dog;

public class TestHotdog {

    public static void main(String[] args) {

        Additions hotdog = new Personalize(new BasicHotdog());

        Additions hotdogWithIngredients = new Personalize(new BasicHotdog());

        System.out.println("\n");

        System.out.println("***perro sencillo***");
        hotdog.simple();

        System.out.println("\n");

        System.out.println("***Perro con Adicion***");
        hotdogWithIngredients.combo();
        hotdogWithIngredients.sauces();
        hotdogWithIngredients.cheese();
    }
}
