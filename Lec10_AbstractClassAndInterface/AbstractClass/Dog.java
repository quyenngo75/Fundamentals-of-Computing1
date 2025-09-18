
package Lec10_AbstractClassAndInterface.AbstractClass;


public class Dog extends Animal{
    public Dog(String name)
    {
        super(name);
    }
    
    @Override
    public void makeSound()
    {
        System.out.println("Gau Gau");
    }
}
