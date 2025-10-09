package Code8_OOP_ROOM;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BedRoom extends Room {

    private int numberOfBeds;

    public BedRoom() {
    }

    public BedRoom(int numberOfBeds, String id, String name, double cost, Date checkInDate, Date checkOutDate) {
        super(id, name, cost, checkInDate, checkOutDate);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void addRoom() {
        super.addRoom();
        System.out.println("Enter number of beds: ");
        setNumberOfBeds(Integer.parseInt(sc.nextLine()));

    }

    @Override
    public void disPlayDetails() {
        super.disPlayDetails();
        System.out.println("number of beds: " + getNumberOfBeds());
        System.out.println("calculate cost: " + calculateCost());
    }

    @Override
    public boolean updateRoom() {
        super.updateRoom();
        System.out.println("Update number of beds: ");
        setNumberOfBeds(Integer.parseInt(sc.nextLine()));
        return true;
    }

    @Override
    public double calculateCost() {
        if (getNumberOfBeds() >= 3) {
            return getCost() * 1.1;
        }
        return getCost() * calculateDaysOfStay();
    }

}
