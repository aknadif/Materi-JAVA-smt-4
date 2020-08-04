package Pertemuan8;

public class Private {
    private String fname = "Ahmad";
    private String lname = "Nadhif";
    private String email = "aknadif58@gmail.com";
    private String age = "19";

    public static void main(String[] args) {
        Private myObj = new Private();
        System.out.println("Nama = " + myObj.fname + " " + myObj.lname);
        System.out.println("Email = " + myObj.email);
        System.out.println("Umur = " + myObj.age);
    }
}