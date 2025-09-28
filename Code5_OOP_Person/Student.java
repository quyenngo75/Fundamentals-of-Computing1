package Code5_OOP_Person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private double gpa;
    private double tutionFee;

    public Student() {
    }

    public Student(double gpa, double tutionFee, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.gpa = gpa;
        this.tutionFee = tutionFee;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTutionFee() {
        return tutionFee;
    }

    public void setTutionFee(double tutionFee) {
        this.tutionFee = tutionFee;
    }
    @Override
    public void addPerson()
    {
        super.addPerson();
        System.out.println("Enter gpa: ");
        setGpa(Double.parseDouble(sc.nextLine()));
        System.out.println("Enter tuitionFee: ");
        setTutionFee(Double.parseDouble(sc.nextLine()));
    }
    @Override
    public boolean updatePerson()
    {
        super.addPerson();
        System.out.println("Update gpa: ");
        setGpa(Double.parseDouble(sc.nextLine()));
        System.out.println("Update tuitionFee: ");
        setTutionFee(Double.parseDouble(sc.nextLine()));
        return true;
    }
    @Override
    public void disPlayDetails()
    {
        super.disPlayDetails();
        System.out.println("gpa: "+getGpa());
        System.out.println("tuition fee: "+getTutionFee());
    }
    @Override
    public double calculateIncome()
    {
        if(getGpa() > 3.5)
        {
            return getTutionFee() * 0.5;
        }
        return getTutionFee();
    }
}
