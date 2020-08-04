package Pertemuan12;

class vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class methodoverriding extends vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        methodoverriding obj = new methodoverriding();
        obj.run();
    }
}