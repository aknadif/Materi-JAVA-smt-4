package Pertemuan8;

public class kons {
    int mmodelTahun;
    String modelNama;

    public kons(int tahun, String nama) {
        mmodelTahun = tahun;
        modelNama = nama;
    }

    public static void main(String[] args) {
        kons myCar = new kons(1969, "Mustang");
        System.out.println(myCar.mmodelTahun + " " + myCar.modelNama);
    }
}