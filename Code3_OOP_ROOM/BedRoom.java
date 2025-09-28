
package Code3_OOP_ROOM;

import java.util.Date;


public class BedRoom extends Room{
    private int numberOfBeds;

    public BedRoom() {
    }

    public BedRoom(int numberOfBeds, String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.numberOfBeds = numberOfBeds;
    }

    public BedRoom(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
   
    @Override
    public void addRoom()
    {
        super.addRoom();
        System.out.println("Enter number of beds: ");
        setNumberOfBeds(sc.nextInt());
    }
     @Override
    public void disPlayDetails()
    {
        super.disPlayDetails();
        System.out.println("Number of beds: "+getNumberOfBeds());
    }
    @Override
    public boolean updateRoom()
    {
        super.updateRoom();
        System.out.println("Update number of beds: ");
        setNumberOfBeds(sc.nextInt());
        return true;
    }
    @Override
    public double calculateCost()
    {
        double cost = getBaseCost() * calculateDaysOfStay();
        if(getNumberOfBeds() >= 3)
        {
            return getBaseCost() * 1.1;
        }
        return cost;
    }
}
