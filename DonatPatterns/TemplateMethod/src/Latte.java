public class Latte extends CoffeePreparation{
    @Override
    protected void brew() {
        System.out.println("Brewing coffee and steaming milk...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and cinnamon...");
    }
}
