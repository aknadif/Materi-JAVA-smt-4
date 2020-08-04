package Pertemuan13;

class person {
    int id;
    String nama;

    person(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }
}

class Emp extends person {
    float salary;

    Emp(int id, String nama, float salary) {
        super(id, nama);
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + nama + " " + salary);
    }
}

class testsuper {
    public static void main(String[] args) {
        Emp e1 = new Emp(1803010024, "Nadhif", 6000000);
        e1.display();
    }
}