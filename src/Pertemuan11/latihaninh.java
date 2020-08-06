package Pertemuan11;

class Sepeda {
    void merek() {
        System.out.println("Sepeda beraneka merek");
    }

    void harga() {
        System.out.println("Rp 500.000 - Rp 3M");
    }

    void fungsi() {
        System.out.println("Bisa di pedal");
    }

    void kesehatan() {
        System.out.println("Bersepeda Membuat anda sehat");
    }
}

class Brompton extends Sepeda {
    void merek() {
        System.out.println("Sepeda Brompton");
    }

    void harga() {
        System.out.println("Rp 56.000.000");
    }

    void fungsi() {
        System.out.println("Bisa dipedal, dan bisa dilipat, PRIVILAGE AUTO NAIK");
    }
}

public class latihaninh {
    public static void main(String[] args) {
        Brompton sepedamahal = new Brompton();
        sepedamahal.merek();
        sepedamahal.harga();
        sepedamahal.fungsi();
        sepedamahal.kesehatan();
    }
}