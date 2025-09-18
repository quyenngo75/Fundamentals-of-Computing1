package Lec10_AbstractClassAndInterface.AbstractClass;

public class Processor {

    public static void main(String[] args) {
        Dog dog = new Dog("Lu Lu");
        dog.disPlay();
        dog.makeSound();
        Cat cat = new Cat("Mi Mi");
        cat.disPlay();
        cat.makeSound();
    }
}
