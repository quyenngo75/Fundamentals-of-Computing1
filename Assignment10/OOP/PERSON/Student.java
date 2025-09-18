package Assignment10.OOP.PERSON;

import java.util.*;

public class Student extends Person {

    private String studentId;

    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void input() {
        System.out.println("Input studentId: ");
        setStudentId(sc.nextLine());
        super.input();
    }

    public void evaluate() {
        System.out.println("input 1.Good 2.Rather 3.Medium 4.weak");
        int evaluate = sc.nextInt();
        switch (evaluate) {
            case 1:
                System.out.println("Good! ");
                break;
            case 2:
                System.out.println("Rather! ");
                break;
            case 3:
                System.out.println("Medium! ");
                break;
            case 4:
                System.out.println("Weak! ");
                break;
            default:
                System.out.println("EROOR! ");
                break;
        }
    }

    @Override
    public String output() {
        super.output();
        return ("StudentId: " + studentId);
    }
}
