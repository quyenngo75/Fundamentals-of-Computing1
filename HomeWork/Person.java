package HomeWork;

import java.text.SimpleDateFormat;
import java.util.*;

public class Person {

    private int id = 0;
    private String fullName;
    private Date date;
    private String sex;

    public Person(int id, String fullName, Date date, String sex) {
        this.fullName = fullName;
        this.date = date;
        this.id = id;
        this.sex = sex;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    Scanner sc = new Scanner(System.in);
    int n = 0;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    void input() {
        try {
            System.out.println("Input fullname: ");
            setFullName(sc.nextLine());
            System.out.println("Input date (dd/MM/yyyy): ");
            String datestr = sc.nextLine();
            setDate(sdf.parse(datestr));
            date = sdf.parse(datestr);
            System.out.println("Input sex: ");
            setSex(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Date Error!" + e.getMessage());
        }
    }

    void output() {

        System.out.println("Id: " + getId());
        System.out.println("fullname: " + getFullName());
        System.out.println("date: " + getDate());
        System.out.println("sex: " + getSex());
    }
}
