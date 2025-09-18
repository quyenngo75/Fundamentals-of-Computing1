package HomeWork;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want input information for:"
                    + " 1.Student 2.Teacher 3.Out ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Input information for Student: ");
                Student std = new Student();
                std.input();
                std.evaluate();
                std.output();
            } else if (choice == 2) {
                System.out.println("Input information for Teacher: ");
                Teacher tc = new Teacher();
                tc.input();
                tc.ranking();
                tc.output();
            } else {
                System.out.println("Error! Choice again");
            }
            System.out.println("Continue? 1.yes 0.no");
            int cont = sc.nextInt();
            if (cont == 0) {
                break;
            }
        }
    }
}
