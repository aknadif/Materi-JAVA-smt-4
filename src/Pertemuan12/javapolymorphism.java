package Pertemuan12;

class Animal {
    public void animalSound() {
        System.out.println("The animal make sound");
    }
}

class cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says : meow ow");
    }
}

class dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says :  guk guk bark");
    }
}

class javapolymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new cat();
        Animal myDog = new dog();
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
    }
}