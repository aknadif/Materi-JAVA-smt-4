package Pertemuan13;

public class staticbinding {
    private void eat() {
        System.out.println("Cat is eating");
    }

    public static void main(String[] args) {
        staticbinding d1 = new staticbinding();
        d1.eat();
    }
}