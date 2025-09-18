package Lec11_Encapsultation.StaticMethod;
import java.text.*;
public class Student {

    int rollno;
    String name;
    static String college = "DTU";
SimpleDateFormat std = new SimpleDateFormat();
    static void change() {
        college = "BBDIT";
    }

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Trang");
        Student s2 = new Student(222, "Duong");
        s1.display();
        s2.display();

    }
}
