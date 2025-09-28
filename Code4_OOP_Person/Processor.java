package Code4_OOP_Person;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonList personList = new PersonList();
        int choice;
        do {
            System.out.println("\n=====MENU=====");
            System.out.println("1. Add person (Student/Teacher)");
            System.out.println("2. Update person by ID");
            System.out.println("3. Delete person by ID");
            System.out.println("4. Find person by ID");
            System.out.println("5. Display all persons");
            System.out.println("6. Find Top 3 students (by income)");
            System.out.println("7. Find teacher with highest income");
            System.out.println("8. Find students with scholarships");
           
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter 1.Student 2.Teacher");
                    int type;
                    type = Integer.parseInt(sc.nextLine());
                    if (type == 1) {
                        Student st = new Student();
                        st.addPerson();
                        personList.addPerson(st);
                    } else if (type == 2) {
                        Teacher teacher = new Teacher();
                        teacher.addPerson();
                        personList.addPerson(teacher);
                    }
                    break;
                case 2:
                    System.out.println("Enter id to Update: ");
                    String idUpdate = sc.nextLine();
                    if (!personList.updatePersonById(idUpdate)) {
                        System.out.println("Not found!");
                    } else {
                        System.out.println("Update sucessfully!");
                    }
                    break;
                case 3:
                    System.out.println("Enter id to delete");
                    String deleted = sc.nextLine();
                    if (!personList.deletePersonById(deleted)) {
                        System.out.println("Not found!");
                    } else {
                        System.out.println("Deleted successfully!");
                    }
                    break;
                case 4:
                    System.out.println("Enter id to find");
                    String findId = sc.nextLine();
                    Person p = personList.findPersonById(findId);
                    if (p != null) {
                        p.disPlayDetails();
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 7:
                    Teacher best = personList.findTeacherWithHighestIncome();
                    if (best != null) {
                        System.out.println("Teacher highest income: ");
                        best.disPlayDetails();
                    } else {
                        System.out.println("No teacher found!");
                    }
                    break;
                case 5:
                    personList.disPlayAllPerson();
                    break;
                case 6:
                    System.out.println("Top 3 student: ");
                    for (Student s : personList.findTop3Students()) {
                        s.disPlayDetails();
                        System.out.println("------------");
                    }
                    break;
                case 8:
                    System.out.println("Student with scholarship ");
                    for (Person s : personList.findStudentsWithScholarship()) {
                        s.disPlayDetails();
                        System.out.println("-------");
                    }
                    break;
                case 0:
                    System.out.println("exit program!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
