package Pertemuan8;

public class Default {
    String fname = "Ahmad";
    String lname = "Nadhif";
    String email = "aknadif58@gmail.com";
    String age = "19";

    public static void main(String[] args) {
        Default myObj = new Default();
        System.out.println("Nama = " + myObj.fname + " " + myObj.lname);
        System.out.println("Email = " + myObj.email);
        System.out.println("Umur = " + myObj.age);
    }
}