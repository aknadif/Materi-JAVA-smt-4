package Pertemuan8;

public class methodjava {
    // Static Method
    static void myStaticMethod() {
        System.out.println("Method static dapat dipanggil tanpa harus membuat objek");
    }

    // Public Method
    public void myPublicMethod() {
        System.out.println("Public method/nonstatik method harus menggunakan objek baru bisa dipanggil");
    }

    // Main Method
    public static void main(String[] args) {
        myStaticMethod();
        methodjava myObj = new methodjava();
        myObj.myPublicMethod();
    }
}