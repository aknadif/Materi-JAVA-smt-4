package Pertemuan14;

interface printable {
    void print();
}

class javainterface implements printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        javainterface obj = new javainterface();
        obj.print();
    }
}