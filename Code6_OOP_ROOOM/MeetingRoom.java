package Code6_OOP_ROOOM;

import java.util.Date;

public class MeetingRoom extends Room {

    private int capacity;

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity, String id, String name, double basecost, Date checkin, Date checkout) {
        super(id, name, basecost, checkin, checkout);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public void addroom(){
        super.addroom();
        System.out.println("enter capacity");
        setCapacity(sc.nextInt());
    }
    @Override
    public void displaydetails(){
        super.displaydetails();
        System.out.println("capacity:"+getCapacity());
        System.out.println("Number of stay: "+ calculateDaysOfStay());
        System.out.println("cost: "+ calculateCost());
    }
    
    @Override
    public double calculateCost()
    {
        if(getCapacity() > 50)
        {
            return getBasecost() * 1.2;
        }
        return getBasecost();
    }
}
