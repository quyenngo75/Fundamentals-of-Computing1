package Code4_OOP_Person;

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
        System.out.println("Enter number of class: ");
        setNumberOfClasses(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter base Salary: ");
        setBaseSalary(sc.nextDouble());
    }
    @Override
    public double calculateIncome()
    {
        return getBaseSalary() * getNumberOfClasses();
    }
    @Override
    public boolean updatePerson()
    {
        super.updatePerson();
            sc.nextLine();
        System.out.println("Update number of class: ");
         setNumberOfClasses(Integer.parseInt(sc.nextLine()));
         System.out.println("Update base Salary: ");
         setBaseSalary(sc.nextDouble());
         return true;
    }
    @Override
    public void disPlayDetails()
    {
        super.disPlayDetails();
        System.out.println("number of class: "+getNumberOfClasses());
        System.out.println("Base salary: "+getBaseSalary());
        System.out.println("Net tuition fee (after scholarship if any): " + calculateIncome());
    }
    
}
