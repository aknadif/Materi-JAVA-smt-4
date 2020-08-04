package Pertemuan13;

class Animal {
    void makan() {
        System.out.println("Makan...");
    }
}

class cat extends Animal {
    void makan() {
        System.out.println("Makan ikan eow,meoww");
    }
}

class kitten extends cat {
    void makan() {
        System.out.println(("Minum susu owww...."));
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal a1, a2, a3;
        a1 = new Animal();
        a2 = new cat();
        a3 = new kitten();

        a1.makan();
        a2.makan();
        a3.makan();
    }
}