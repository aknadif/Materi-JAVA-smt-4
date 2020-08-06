package Pertemuan11;

public class Buku {
    int idbuku, tahun;
    String judul;
    Pengarang pengarang;

    public Buku(int idbuku, String judul, int tahun, Pengarang pengarang) {
        this.idbuku = idbuku;
        this.judul = judul;
        this.tahun = tahun;
        this.pengarang = pengarang;
    }

    void display() {
        System.out.println("ID Buku = " + idbuku);
        System.out.println("Judul Buku = " + judul);
        System.out.println("Tahun Terbit = Tahun " + tahun);
        System.out.println("Pengarang = " + pengarang.nama + ", Alamat di " + pengarang.alamat);
    }

    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Nadhif", "SURAKARTA");
        Buku buku1 = new Buku(1803010024, "Buku Sejarah Brompton", 2000, pengarang1);
        buku1.display();
    }

}