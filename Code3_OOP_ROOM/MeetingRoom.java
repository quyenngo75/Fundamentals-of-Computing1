package Code3_OOP_ROOM;

import java.util.Date;

public class MeetingRoom extends Room {

    public int capacity;

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity, String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void addRoom() {
        super.addRoom();
        System.out.println("Enter capacity: ");
        setCapacity(sc.nextInt());
    }

    @Override
    public void disPlayDetails() {
        super.disPlayDetails();
        System.out.println("Capacity: "+getCapacity());
    }

    @Override
    public boolean updateRoom() {
        super.updateRoom();
        System.out.println("update capacity: ");
        setCapacity(sc.nextInt());
        return true;
    }

    @Override
    public double calculateCost() {
        double cost = getBaseCost() * calculateDaysOfStay();
        if(getCapacity() > 50)
        {
            return getBaseCost() * 1.2;
        }
        return cost;
    }

}
