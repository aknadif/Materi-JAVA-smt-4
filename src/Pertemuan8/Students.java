package Pertemuan8;

abstract class manusia {
    public String fname = "Ahmad";
    public int age = 19;

    public abstract void study();
}

class Students extends manusia {
    public int tahunKelulusanku = 2018;

    public void study() {
        System.out.println("Studying all day long");
    }

}