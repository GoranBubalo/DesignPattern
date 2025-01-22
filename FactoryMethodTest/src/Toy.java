public interface Toy {
    String getName();
}


class Car implements Toy {
    @Override
    public String getName() {
        return "Factory made a car toy...";
    }
}

class Doll implements Toy {
    @Override
    public  String getName() {
        return "Factory made a doll toy...";
    }
}

class Boat implements Toy {
    @Override
    public String getName() {
        return "Factory made a boat toy...";
    }
}
