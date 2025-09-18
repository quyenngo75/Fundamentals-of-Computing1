
package Lec9_InheritanceAndPolymorphism.Overriding;

public class Cat extends Animal {
    @Override
    void makeSound()
    {
        System.out.println("Meo Meo");
    }
}
