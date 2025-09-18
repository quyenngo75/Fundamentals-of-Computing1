package Lec8_ObjectAndClass;

public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void disPlayDetails() {
        System.out.println("Car model: " + model + ", Car year: " + year);
    }
}

