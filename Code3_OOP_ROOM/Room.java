package Code3_OOP_ROOM;

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double baseCost;
    private Date checkinDate;
    private Date checkoutDate;
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Room(String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public Room() {
    }

    @Override
    public void addRoom() {
        System.out.println("Enter id: ");
        setId(sc.nextLine());
        System.out.println("Enter name: ");
        setName(sc.nextLine());
        System.out.println("Enter base cost: ");
        setBaseCost(sc.nextDouble());
        sc.nextLine();
        try {
            System.out.println("Enter checkin date: ");
            String dateIn = sc.nextLine();
            setCheckinDate(sdf.parse(dateIn));
            System.out.println("Enter checkout date: ");
            String dateOut = sc.nextLine();
            setCheckinDate(sdf.parse(dateOut));
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    @Override
    public void disPlayDetails() {
        System.out.println("id: " + getId());
        System.out.println("name: " + getName());
        System.out.println("base cost: " + getBaseCost());
        System.out.println("check in date: " + getCheckinDate());
        System.out.println("check out date: " + getCheckoutDate());
    }

    @Override
    public boolean updateRoom() {
        System.out.println("Update name: ");
        setName(sc.nextLine());
        System.out.println("update base cost:");
        setBaseCost(sc.nextDouble());
        try {
            System.out.println("Update checkin date: ");
            String dateIn = sc.nextLine();
            setCheckinDate(sdf.parse(dateIn));
            System.out.println("Update checkout date: ");
            String dateOut = sc.nextLine();
            setCheckinDate(sdf.parse(dateOut));
        } catch (Exception e) {
            System.out.println("Error!");
        }
        return true;
    }

    @Override
    public abstract double calculateCost();

    public int calculateDaysOfStay() {
        if(getCheckinDate() == null || getCheckoutDate() == null)
        {
            return 0;
        }
        long diff = getCheckoutDate().getTime() - getCheckinDate().getTime();  
        return (int) (diff/ (1000 * 60 * 60 * 24));
    }
}
