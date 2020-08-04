package Pertemuan14;

abstract class Bike {
    Bike() {
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Gear Changed");
    }
}

class Polygon extends Bike {
    void run() {
        System.out.println("Running Safely....");
    }
}

public class contohabstrak {
    public static void main(String[] args) {
        Bike obj = new Polygon();
        obj.run();
        obj.changeGear();
    }
}