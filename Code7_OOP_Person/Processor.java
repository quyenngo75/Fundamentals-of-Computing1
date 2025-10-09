package Code7_OOP_Person;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("(1) Add a new Person (Student/Teacher). \n"
                    + "(2) Update a Person by id. \n"
                    + "(3) Delete a Person by id. \n"
                    + "(4) Find a Person by id. \n"
                    + "(5) Display all Persons.\n"
                    + "(6) Total Person.\n"
                    + "(7) Highest Teacher Income\n"
                    + "(8) Student with scholar ship\n"
                    + "(9) Top 3 Student"
                    + "(0) exit sign =))) )");
            choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("1.Student || 2.Teacher");
                    int type = sc.nextInt();
                    if (type == 1) {
                        Student std = new Student();

                        std.addPerson();
                        personList.addPerson(std);
                    } else if (type == 2) {
                        Teacher teacher = new Teacher();

                        teacher.addPerson();
                        personList.addPerson(teacher);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter id to update: ");
                    sc.nextLine();
                    String updateId = sc.nextLine();
                    if (personList.updatePersonById(updateId)) {
                        System.out.println("Update successfully");
                    } else {
                        System.out.println("Not found id to update!!");
                    }

                    break;
                }
                case 3: {
                    System.out.println("Enter id to delete: ");
                    sc.nextLine();
                    String deleteId = sc.nextLine();
                    if (personList.deletePersonById(deleteId)) {
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Not found id to deleted!!");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter id to find: ");
                    sc.nextLine();
                    String findId = sc.nextLine();
                    Person p = personList.findPersonById(findId);
                    if (p != null) {
                        p.disPlayDetails();
                    } else {
                        System.out.println("Not found id to find!!");
                    }
                    break;
                }
                case 5: {
                    System.out.println("\n ============");
                    personList.disPlayAll();
                    break;
                }
                case 6:
                    System.out.println("Total person is: ");
                    personList.countPerson();
                    break;
                case 7:
                    System.out.println("Teacher highest income: ");
                    personList.findTeacherWithHighestIncome().disPlayDetails();
                    break;
                case 8:
                    System.out.println("Student with shcolarship: ");
                    for (Student s : personList.findStudentWithScholarship()) {

                        s.disPlayDetails();
                        System.out.println("-----------------");
                    }
                case 9:
                    System.out.println("Top 3 student:");
                    for(Student s : personList.FindTop3Student())
                    {
                        s.disPlayDetails();
                        System.out.println("-------------");
                    }
                    break;
                case 0:
                    System.out.println("Exit program!");
                default:
                    System.out.println("Eror!!!");
            }
        } while (choose != 0);
    }
}
