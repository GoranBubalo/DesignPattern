abstract class CoffeePreparation {

    // Template method FINAL-> to prevent subclasses from overriding it.
    public final void prepareCoffee() {
        boilWater();
        if (customerWantsMilk()) { // Hook method
            boilMilk();
        }
        brew();
        pourInCup();
        if (customerWantsCondiments()) { // Hook method
            addCondiments();
        }
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();

    // Hook methods with default implementations
    protected boolean customerWantsCondiments() {
        return true;
    }

    protected boolean customerWantsMilk() {
        return true;
    }

    // Core methods
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void boilMilk() {
        System.out.println("Boiling milk...");
    }

    private void pourInCup() {
        System.out.println("Pouring coffee into the cup...");
    }
}
