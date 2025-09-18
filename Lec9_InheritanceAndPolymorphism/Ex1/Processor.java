package Lec9_InheritanceAndPolymorphism.Ex1;

public class Processor {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        System.out.println("Cat ID: " + cat.catID);
        System.out.println("Source: "+cat.source);
        cat.catchMouse();

        Dog dog = new Dog();
        dog.makeSound();
        System.out.println("Dog ID: " + dog.dogId);
        dog.guardHouse();
        System.out.println("Source: "+dog.source);
    }
}
