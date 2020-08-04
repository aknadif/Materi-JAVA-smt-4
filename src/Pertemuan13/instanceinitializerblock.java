package Pertemuan13;

class A {
    A() {
        System.out.println("parent class constructor invoked");
    }
}

class instanceinitializerblock extends A {
    instanceinitializerblock() {
        super();
        System.out.println("child class constructor invoked");
    }

    instanceinitializerblock(int a) {
        super();
        System.out.println("child class constructor invoked " + a);
    }

    {
        System.out.println("instance initializer block is invoked");
    }

    public static void main(String args[]) {
        instanceinitializerblock b1 = new instanceinitializerblock();
        instanceinitializerblock b2 = new instanceinitializerblock(10);
    }
}