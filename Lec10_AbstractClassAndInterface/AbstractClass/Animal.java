
package Lec10_AbstractClassAndInterface.AbstractClass;

public abstract class Animal {
    private String name;
    public Animal(String name)
    {
        this.name = name;
    }
    public void disPlay()
    {
        System.out.println("Name: "+name);
    }
    public abstract void makeSound();
    
}
