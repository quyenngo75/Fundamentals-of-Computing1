package Code7_OOP_Person;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Person implements IPerson {

    private String id;
    private String name;
    private Date dateOfBirth;
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

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
            setDateOfBirth(sdf.parse(sc.nextLine()));
        } catch (Exception e) {
            System.out.println("Error format birthday");
        }
    }

    @Override
    public void disPlayDetails()
    {
        System.out.println("id: "+getId());
        System.out.println("name: "+getName());
        System.out.println("date of birth: "+sdf.format(getDateOfBirth()));
    }
    @Override
    public void updatePerson()
    {
          try {
            sc.nextLine();
            System.out.println("Update name: ");
            setName(sc.nextLine());
            System.out.println("Update date of birth: ");
            setDateOfBirth(sdf.parse(sc.nextLine()));
        } catch (Exception e) {
            System.out.println("Error format birthday");
        }       
    }

}
