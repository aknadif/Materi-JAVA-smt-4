package Pertemuan10;

public class getandset {
    private String nama;

    public String getName() {
        return nama;
    }

    public void setNama(String newnama) {
        this.nama = newnama;
    }

    public static void main(String[] args) {
        getandset myObj = new getandset();
        myObj.setNama("Nadhif");
        System.out.println(myObj.getName());
    }
}
