package Pertemuan10;

public class praktikum {

    String nama;
    int umur;
    double IPK;
    boolean status;

    praktikum() {
        nama = "Default";
        umur = 0;
        IPK = 0;
        status = true;
    }

    praktikum(String nama1, int umur1, double IPK1, boolean status1) {
        nama = nama1;
        umur = umur1;
        IPK = IPK1;
        status = status1;
    }

    // Method Get
    String getNama() {
        return nama;
    }

    int getUmur() {
        return umur;
    }

    double getIPK() {
        return IPK;
    }

    boolean getStatus() {
        return status;
    }

    // Method Set
    void setNama(String nama) {
        this.nama = nama;
    }

    void setUmur(int umur) {
        this.umur = umur;
    }

    void setIPK(double IPK) {
        this.IPK = IPK;
    }

    void setStatus(boolean status) {
        this.status = status;
    }

    public static void main(String[] args) {
        // Membuat Objek dari Class
        // ============== INPUT ==============
        praktikum Nadhif = new praktikum("Nadhif", 19, 4.0, false);
        // ============== OUTPUT ==============
        System.out.println("Nama Saya: " + Nadhif.getNama());
        System.out.println("Umur Saya: " + Nadhif.getUmur() + " Tahun");
        System.out.println("Nilai IPK Saya: " + Nadhif.getIPK());
        System.out.println("Status Saya: " + Nadhif.getStatus());
    }
}