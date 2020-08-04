package Pertemuan11;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class dog extends Animal {

    void bark() {
        System.out.println("guk..guk...");
    }
}

class cat extends Animal {
    void meow() {
        System.out.println("Meowww..");
    }
}

class Testheritance {
    public static void main(String args[]) {
        cat c = new cat();
        c.meow();
        c.eat();
        dog d = new dog();
        d.bark();
        d.eat();
    }
}
