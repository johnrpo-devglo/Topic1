package hotdog;

public class TestHotdog {

    public static void main(String[] args) {

        System.out.println("************************");
        System.out.println("    Hotdog Simple");
        Add hotdogSimple = new Simple(new Hotdog());

        hotdogSimple.add();
        System.out.println("________________________");

        System.out.println("\n");

        System.out.println("    Hotdog Personalize");

        Add chips = new Chips(new Hotdog());
        Add pineapple = new Pineapple(new Hotdog());
        Add sauces = new Sauces(new Hotdog());
        Add bacon = new Bacon(new Hotdog());

        pineapple.add();
        chips.add();
        bacon.add();
        sauces.add();



    }
}