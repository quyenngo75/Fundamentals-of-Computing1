package Code5_OOP_Person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Person implements IPerson {

    private String id;
    private String name;
    private Date dateOfBirth;
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Person() {
    }

    public Person(String id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void addPerson() {
        try {
            System.out.println("Enter id: ");
            setId(sc.nextLine());
            System.out.println("Enter name: ");
            setName(sc.nextLine());
            System.out.println("Enter date of birth: ");
            String date = sc.nextLine();
            setDateOfBirth(sdf.parse(date));
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    @Override
    public boolean updatePerson() {
        try {
            System.out.println("Update name: ");
            setName(sc.nextLine());
            System.out.println("Update date of birth: ");
            String date = sc.nextLine();
            setDateOfBirth(sdf.parse(date));
        } catch (Exception e) {
            System.out.println("Error!");
        }
        return true;
    }

    @Override
    public void disPlayDetails() {
        System.out.println("id: " + getId());
        System.out.println("name: " + getName());
        System.out.println("date of birth: " + getDateOfBirth());
    }
}
