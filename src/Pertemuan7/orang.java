package Pertemuan7;

public class orang {
    String namadepan = "Ahmad";
    String namabelakang = "Nadhif";
    int age = 19;

    public static void main(String[] args) {
        orang myObj = new orang();
        System.out.println("Nama = " + myObj.namadepan + " " + myObj.namabelakang);
        System.out.println("Umur = " + myObj.age);
    }
}