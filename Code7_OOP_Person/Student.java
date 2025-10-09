package Code7_OOP_Person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private double gpa;
    private double tuitionFee;

    public Student() {
    }

    public Student(double gpa, double tuitionFee, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.gpa = gpa;
        this.tuitionFee = tuitionFee;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void addPerson()
    {
        super.addPerson();
        System.out.println("Enter gpa: ");
        setGpa(sc.nextDouble());
        System.out.println("Enter tuition fee: ");
        setTuitionFee(sc.nextDouble());
    }
    @Override
    public void disPlayDetails()
    {
        super.disPlayDetails();
        System.out.println("gpa: "+getGpa());
        System.out.println("tuition fee: "+getTuitionFee());
        System.out.println("income: " +calculateIncome());
    }
    @Override 
    public void updatePerson()
    {
        super.updatePerson();
        System.out.println("Update gpa: ");
        setGpa(sc.nextDouble());
        System.out.println("Update tuition fee: ");
        setTuitionFee(sc.nextDouble());
    }
    @Override 
    public double calculateIncome()
    {
        if(getGpa() > 3.5)
        {
            return getTuitionFee() * 0.5;
        }
        return getTuitionFee();
    }
}
