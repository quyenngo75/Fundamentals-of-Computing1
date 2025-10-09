package Code7_OOP_Person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    private int numberOfClasses;
    private double baseSalary;

    public Teacher() {
    }

    public Teacher(int numberOfClasses, double baseSalary, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.numberOfClasses = numberOfClasses;
        this.baseSalary = baseSalary;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void addPerson() {
        super.addPerson();
        System.out.println("Enter number of classes: ");
        setNumberOfClasses(sc.nextInt());
        System.out.println("Enter base salary: ");
        setBaseSalary(sc.nextDouble());
    }

    @Override
    public void updatePerson() {
        super.updatePerson();
        System.out.println("Update number of classes: ");
        setNumberOfClasses(sc.nextInt());
        System.out.println("Update base salary: ");
        setBaseSalary(sc.nextDouble());
    }

    @Override
    public void disPlayDetails() {
        super.disPlayDetails();
        System.out.println("number of classes: " + getNumberOfClasses());
        System.out.println("base salary: " + getBaseSalary());
        System.out.println("income: " + calculateIncome());
    }

    @Override
    public double calculateIncome() {
        return getNumberOfClasses() * getBaseSalary();
    }

}
