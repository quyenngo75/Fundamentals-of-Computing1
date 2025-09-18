
package Lec10_AbstractClassAndInterface.AbstractClass;

public class Cat extends Animal {
    public Cat(String name)
    {
        super(name);
    }
    @Override
    public void makeSound()
    {
        System.out.println("Meo Meo");
    }
    
}
