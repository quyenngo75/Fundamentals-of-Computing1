
package Assignment10.OOP_ROOM;
import java.util.*;
public abstract class Room implements IRoom{
    private String id;
    private String name;
    private double baseCost;
    Scanner sc = new Scanner(System.in);
    public Room() {
    }

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    @Override
    public void addRoom()
    {
        System.out.println("");
    }
    @Override
    public void updateRoom()
    {
        System.out.println("Enter id: ");
        setId(sc.nextLine());
        System.out.println("Enter name: ");
        setName(sc.nextLine());
        System.out.println("Enter BaseCost: ");
        setBaseCost(sc.nextDouble());
    }
    @Override
    public void disPlayDetails()
    {
        System.out.println("Id: "+getId());
        System.out.println("Name: "+getName());
        System.out.println("Base cost: "+getBaseCost());
    }
    public double calculateCost()
    {
        return getBaseCost();  
    }
}
