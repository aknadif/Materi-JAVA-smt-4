package Pertemuan9;

public class Overloading {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int nomor1 = plusMethod(5, 2);
        double nomor2 = plusMethod(8.9, 7.4);
        System.out.println("int = " + nomor1);
        System.out.println("double = " + nomor2);
    }
}