package Pertemuan9;

class Mahasiswa {
    String nama, nim;
    int tugas, uts, uas, hasil;

    Mahasiswa(String nama, String nim, int tugas, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    void show() {
        System.out.println("Nama = " + this.nama);
        System.out.println("NIM = " + this.nim);
        System.out.println("Nilai Tugas = " + this.tugas);
        System.out.println("Nilai UTS = " + this.uts);
        System.out.println("Nilai UAS = " + this.uas);
    }

    // Overloading

    static int kali(int a, int b) {
        return a * b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    void total() {

        double x = kali(this.tugas, 0.3);
        double y = kali(this.uts, 0.2);
        double z = kali(this.uas, 0.5);
        double hasil = x + y + z;

        if (hasil >= 0 && hasil <= 1) {
            System.out.println("Nilai Akhir " + this.nama + " = " + hasil + ", Poin Anda E");
        } else if (hasil >= 2 && hasil <= 55) {
            System.out.println("Nilai Akhir " + this.nama + " = " + hasil + ", Poin Anda D");
        } else if (hasil >= 56 && hasil <= 75) {
            System.out.println("Nilai Akhir " + this.nama + " = " + hasil + ", Poin Anda C");
        } else if (hasil >= 76 && hasil <= 85) {
            System.out.println("Nilai Akhir " + this.nama + " = " + hasil + ", Poin Anda B");
        } else if (hasil >= 86 && hasil <= 100) {
            System.out.println("Nilai Akhir " + this.nama + " = " + hasil + ", Poin Anda A");
        }
    }

}

public class Main {

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa("Nadhif", "1803010024", 78, 86, 83);
        mhs1.show();
        mhs1.total();

    }

}
