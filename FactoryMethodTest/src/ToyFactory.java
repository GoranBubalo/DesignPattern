public abstract class ToyFactory {
    public abstract Toy createToy();
}

class CarFactory extends ToyFactory {
    @Override
    public Toy createToy() {
        return new Car();
    }
}

class DollFactory extends ToyFactory {
    @Override
    public Toy createToy() {
        return new Doll();
    }
}

class BoatFactory extends ToyFactory {
    @Override
    public Toy createToy() {
        return new Boat();
    }
}