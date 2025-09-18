package Lec8_ObjectAndClass.MethodOverloading;

public class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(100, "Quyen");
        Student s2 = new Student(200, "Ngo");
        s1.display();
        s2.display();
    }
}
