package Code6_OOP_ROOOM;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double basecost;
    private Date checkin;
    private Date checkout;
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Room() {
    }

    public Room(String id, String name, double basecost, Date checkin, Date checkout) {
        this.id = id;
        this.name = name;
        this.basecost = basecost;
        this.checkin = checkin;
        this.checkout = checkout;
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

    public double getBasecost() {
        return basecost;
    }

    public void setBasecost(double basecost) {
        this.basecost = basecost;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    @Override
    public void addroom() {
        try {

            System.out.println("enter id");
            setId(sc.nextLine());
            System.out.println("enter name");
            setName(sc.nextLine());
            System.out.println("enter base cost");
            setBasecost(sc.nextDouble());
            sc.nextLine();

            System.out.println("enter check in date");
            String indate = sc.nextLine().trim();
            setCheckin(sdf.parse(indate));

            System.out.println("enter check out date");
            String outdate = sc.nextLine().trim();
            setCheckout(sdf.parse(outdate));

        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }

    @Override
    public void displaydetails() {
        System.out.println("id:" + getId());
        System.out.println("Name:" + getName());
        System.out.println("base cost:" + getBasecost());
        System.out.println("check in date:" + sdf.format(getCheckin()));
        System.out.println("check out date:" + sdf.format(getCheckout()));
    }
    @Override
    public abstract double calculateCost();
   public int calculateDaysOfStay() {
        if(getCheckin() == null || getCheckout() == null)
        {
            return 0;
        }
        long diff = getCheckout().getTime() - getCheckin().getTime();  
        return (int) (diff/ (1000 * 60 * 60 * 24));
    }
}
