package Code7_OOP_Person;

import java.util.*;

public class PersonList {

    ArrayList<Person> personList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addPerson(Person person) {
        personList.add(person);
    }

    public boolean updatePersonById(String id) {
        for (Person p : personList) {
            if (p.getId().equals(id)) {
                p.updatePerson();
            }
        }
        return false;
    }

    public boolean deletePersonById(String id) {
        return personList.removeIf(p -> p.getId().equals(id));
    }

    public Person findPersonById(String id) {
        for (Person p : personList) {
            if (p.getId().equals(id)) {
                p.disPlayDetails();
            }
        }
        return null;
    }

    public void disPlayAll() {
        System.out.println("LIST PERSON: ");
        for (Person p : personList) {
            p.disPlayDetails();
            System.out.println("------------");
        }
    }

    public void countPerson() {
        int count = 0;
        for (Person p : personList) {
            count++;
        }
        System.out.println("count: " + count);
    }

    public Teacher findTeacherWithHighestIncome() {
        Teacher best = null;
        for (Person p : personList) {
            if (p instanceof Teacher) {
                if (best == null || p.calculateIncome() > best.calculateIncome()) {
                    best = (Teacher) p;
                }
            }
        }
        return best;
    }

    public ArrayList<Student> findStudentWithScholarship() {
        ArrayList<Student> studentList = new ArrayList<>();
        for (Person p : personList) {
            if (p instanceof Student) {
                Student s = (Student) p;
                if (s.calculateIncome() < s.getTuitionFee()) {
                    studentList.add(s);
                }
            }
        }
        return studentList;
    }
    public ArrayList<Student> FindTop3Student()
    {
        ArrayList<Student> students = new ArrayList<>();
        for(Person p : students)
        {
            if(p instanceof Student)
            {
                students.add((Student)p);
            }
        }
        students.sort((a,b)->Double.compare(b.getGpa(), a.getGpa()));
        return new ArrayList<>(students.subList(0, Math.min(3, students.size())));
    }
}
