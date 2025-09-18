
package Lec9_InheritanceAndPolymorphism.Overriding;

public class Dog extends Animal{
    @Override
    void makeSound()
    {
        System.out.println("Gau Gau");
    }
}
