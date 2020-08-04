package Pertemuan8;

class orang {
    protected String fname = "Ahmad";
    protected String lname = "Nadhif";
    protected String email = "aknadif58@gmail.com";
    protected String age = "19";
}

class student extends orang {
    private int tahunKelulusan = 2018;

    public static void main(String[] args) {
        student myObj = new student();
        System.out.println("Nama = " + myObj.fname + " " + myObj.lname);
        System.out.println("Email = " + myObj.email);
        System.out.println("Umur = " + myObj.age);
        System.out.println("Tahun Kelulusan = " + myObj.tahunKelulusan);
    }
}
