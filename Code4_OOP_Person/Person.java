package Code4_OOP_Person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Person implements IPerson {

    private String id;
    private String name;
    private Date dateOfBirth;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);
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
    public void addPerson()
    {
        System.out.println("Enter id: ");
        setId(sc.nextLine());
        System.out.println("Enter name: ");
        setName(sc.nextLine());
        try{
        System.out.println("Enter date of birth: ");
        String Date = sc.nextLine();
        setDateOfBirth(sdf.parse(Date));
        }catch(Exception e)
        {
            System.out.println("Loi dinh dang ngay sinh: ");
        }
                
    }
    @Override
    public boolean updatePerson()
    {
        System.out.println("Update name: ");
        setName(sc.nextLine());
        return true;
    }
    @Override
    public void disPlayDetails()
    {
        System.out.println("id: "+getId());
        System.out.println("name: "+getName());
        System.out.println("date of birth: "+getDateOfBirth());
    }
}
