package Assignment10.OOP.PERSON;

import java.util.*;
import java.text.*;

public class Person {

    private int cmnd;
    private String name;
    private String sex;
    private Date date;
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Person() {
    }

    public Person(int cmnd, String name, String sex, Date date) {
        this.cmnd = cmnd;
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void input() {
        System.out.println("Input cmnd: ");
        setCmnd(Integer.parseInt(sc.nextLine()));
        System.out.println("Input name: ");
        setName(sc.nextLine());
        System.out.println("Input sex: ");
        setSex(sc.nextLine());
        try {
            System.out.println("Input date: ");
            setDate(sdf.parse(sc.nextLine()));
        } catch (Exception e) {
            System.out.println("Loi dinh dang! ");
        }
    }

    public String output() {
        return "Person{" + "cmnd=" + cmnd + ", name=" + name + ", sex=" + sex + ", date=" + date + ", sc=" + sc + ", sdf=" + sdf + '}';
    }
    
}
