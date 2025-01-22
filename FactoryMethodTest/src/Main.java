public class Main {
    public static void main(String[] args) {
        ToyFactory carFactory = new CarFactory();
        ToyFactory dollFactory = new DollFactory();
        ToyFactory boatFactory = new BoatFactory();

        Toy car = carFactory.createToy();
        Toy doll = dollFactory.createToy();
        Toy boat = boatFactory.createToy();

        System.out.println(car.getName());
        System.out.println(doll.getName());
        System.out.println(boat.getName());

    }
}