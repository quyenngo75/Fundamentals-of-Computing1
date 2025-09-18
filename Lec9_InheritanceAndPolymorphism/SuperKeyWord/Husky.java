
package Lec9_InheritanceAndPolymorphism.SuperKeyWord;

public class Husky extends Dog {
    int price = 1500;
    void disPlay()
    {
        System.out.println("Dog's price: "+super.price);
        System.out.println("Husky's price: "+price);
    }
    Husky()
    {
        super();
        System.out.println("Husky's constructor is invoked");
    }
}
