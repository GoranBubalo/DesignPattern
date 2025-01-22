public class BlackCoffee extends CoffeePreparation {

    @Override
    protected void brew() {
        System.out.println("Brewing black coffee...");
    }

    @Override
    protected void addCondiments() {
        // No condiments for black coffee
    }

    @Override
    protected boolean customerWantsCondiments() {
        return false; // Black coffee does not need condiments
    }

    @Override
    protected boolean customerWantsMilk() {
        return false; // Black coffee does not need milk
    }
}
