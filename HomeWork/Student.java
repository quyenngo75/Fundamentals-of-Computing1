package HomeWork;

import java.util.Scanner;

public class Student extends Person {

    private int StudentID;
    Scanner sc = new Scanner(System.in);

    public Student(int StudentID) {
        this.StudentID = StudentID;
    }
    public Student()
    {}
    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    @Override
    void input() {
        System.out.println("Input studentID: ");
        setStudentID(sc.nextInt());
        super.input();

    }

    void evaluate() {
        System.out.println("Choose type: 1.Good 2.Rather 3.Medium 4.Weak");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Good!");
                break;
            case 2:
                System.out.println("Rather!");
                break;
            case 3:
                System.out.println("Medium!");
                break;
            case 4:
                System.out.println("Weak!");
                break;
            default:
                System.out.println("Wrong!");
        }

    }
}
