package Code4_OOP_Person;

import java.util.*;

public class PersonList {

    ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public boolean updatePersonById(String id) {
        for (Person updatePerson : personList) {
            if (updatePerson.getId().equals(id)) {
                return updatePerson.updatePerson();
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
                return p;
            }
        }
        return null;
    }

    public void disPlayAllPerson() {
        for (Person p : personList) {
            p.disPlayDetails();
            System.out.println("----------");
        }
    }

    public ArrayList<Student> findTop3Students() {
        ArrayList<Student> students = new ArrayList<>();
        for (Person p : personList) {
            if (p instanceof Student) {
                students.add((Student) p);
            }
        }
        students.sort((a, b) -> Double.compare(b.calculateIncome(), a.calculateIncome()));
        return new ArrayList<>(students.subList(0, Math.min(3, students.size())));
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

    public ArrayList<Student> findStudentsWithScholarship() {
        ArrayList<Student> list = new ArrayList<>();
        for (Person p : personList) {
            if (p instanceof Student) {
                Student s = (Student) p;
                if (s.calculateIncome() < s.getTuitionFee()) {
                    list.add(s);
                }
            }
        }
        return list;
    }
}
