package Assignment10.OOP_ROOM;

import java.util.*;

public class MeetingRoom extends Room {

    private int capacity;
    Scanner sc = new Scanner(System.in);

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity, String id, String name, double baseCost) {
        super(id, name, baseCost);
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
        System.out.println("Enter capacity: ");
        setCapacity(sc.nextInt());
        super.addRoom();
    }

    @Override
    public void updateRoom() {
    }

    @Override
    public void disPlayDetails() {
        System.out.println("Capacity: "+getCapacity());
        super.disPlayDetails();
    }

    @Override
    public double calculateCost() {
        if (getCapacity() > 50) {
            return getBaseCost() * 0.2;
        }
        return getBaseCost();
    }
}
