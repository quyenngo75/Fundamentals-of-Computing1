package Lec9_InheritanceAndPolymorphism.Overriding;

public class Processor {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
    }
}
