
package Code6_OOP_ROOOM;

import java.util.Date;

public class BedRoom extends Room {
    private int numofbed;

    public BedRoom() {
    }

    public BedRoom(int numofbed, String id, String name, double basecost, Date checkin, Date checkout) {
        super(id, name, basecost, checkin, checkout);
        this.numofbed = numofbed;
    }

    public int getNumofbed() {
        return numofbed;
    }

    public void setNumofbed(int numofbed) {
        this.numofbed = numofbed;
    }
    @Override 
    public void addroom(){
        super.addroom();
        System.out.println("enter num of bed");
        setNumofbed(sc.nextInt());
    }
    @Override
    public void displaydetails(){
        super.displaydetails();
        System.out.println("num of bed "+getNumofbed());
        System.out.println("Number of stay: "+ calculateDaysOfStay());
        System.out.println("cost: "+ calculateCost());
    }
    @Override
    public double calculateCost()
    {
        if(getNumofbed() >=3 )
        {
            return getBasecost() * 1.1;
        }
        return getBasecost();
    }
}
