package Code8_OOP_ROOM;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double cost;
    private Date checkInDate;
    private Date checkOutDate;
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    public Room() {
    }

    public Room(String id, String name, double cost, Date checkInDate, Date checkOutDate) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Override
    public void addRoom() {
        try {
            System.out.println("Enter id: ");
            setId(sc.nextLine());
            System.out.println("Enter name: ");
            setName(sc.nextLine());
            System.out.println("Enter base cost: ");
            setCost(Double.parseDouble(sc.nextLine()));
            System.out.println("Enter check in date: ");
            setCheckInDate(sdf.parse(sc.nextLine()));
            System.out.println("Enter check out date: ");
            setCheckOutDate(sdf.parse(sc.nextLine()));
        } catch (Exception e) {
            System.out.println("Error format date!!!");
        }
    }

    @Override
    public void disPlayDetails() {
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Cost: " + getCost());
        System.out.println("Check in date: " + sdf.format(getCheckInDate()));
        System.out.println("Check out date: " + sdf.format(getCheckOutDate()));
        System.out.println("days of stay: " + calculateDaysOfStay());
    }

    @Override
    public boolean updateRoom() {
        try {
            System.out.println("Update name: ");
            setName(sc.nextLine());
            System.out.println("Update base cost: ");
            setCost(Double.parseDouble(sc.nextLine()));
            System.out.println("Update check in date: ");
            setCheckInDate(sdf.parse(sc.nextLine()));
            System.out.println("Update check out date: ");
            setCheckOutDate(sdf.parse(sc.nextLine()));
        } catch (Exception e) {
            System.out.println("Error format date!!!");
        }
        return true;
    }

    @Override
    public abstract double calculateCost();

    public int calculateDaysOfStay() {
        if (getCheckInDate() == null || getCheckOutDate() == null) {
            return 0;
        }
        long diff = getCheckOutDate().getTime() - getCheckInDate().getTime();
        return (int) (diff / (1000 * 60 * 60 * 24));
    }
}
