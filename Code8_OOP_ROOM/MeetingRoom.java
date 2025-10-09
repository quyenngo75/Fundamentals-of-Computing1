package Code8_OOP_ROOM;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MeetingRoom extends Room {

    private int capacity;

    public MeetingRoom(int capacity, String id, String name, double cost, Date checkInDate, Date checkOutDate) {
        super(id, name, cost, checkInDate, checkOutDate);
        this.capacity = capacity;
    }

    public MeetingRoom() {
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
        setCapacity(Integer.parseInt(sc.nextLine()));

    }

    @Override
    public void disPlayDetails() {
        super.disPlayDetails();
        System.out.println("Capacity: " + getCapacity());
        System.out.println("calculate cost: " + calculateCost());
    }

    @Override
    public boolean updateRoom() {
        super.updateRoom();
        System.out.println("Update Capacity: ");
        setCapacity(Integer.parseInt(sc.nextLine()));
        return true;
    }

    @Override
    public double calculateCost() {
        if (getCapacity() > 50) {
            return getCost() * 1.2;
        }
        return getCost() * calculateDaysOfStay();
    }

}
