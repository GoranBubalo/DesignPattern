public class Main {
    public static void main(String[] args) {

        CoffeePreparation blackCoffee = new BlackCoffee();
        System.out.println("Preparing Black Coffee:");
        blackCoffee.prepareCoffee();

        System.out.println();

        CoffeePreparation latte = new Latte();
        System.out.println("Preparing Latte:");
        latte.prepareCoffee();




    }
}