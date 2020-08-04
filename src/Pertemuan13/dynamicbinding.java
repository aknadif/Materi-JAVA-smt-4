package Pertemuan13;

class Hewan {
    void eat() {
        System.out.println("Hewan is eating...");
    }
}

public class dynamicbinding extends Hewan {
    void eat() {
        System.out.println("Cat is eating");
    }

    public static void main(String[] args) {
        Hewan a = new dynamicbinding();
        a.eat();
    }
}