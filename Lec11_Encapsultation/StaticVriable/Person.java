package Lec11_Encapsultation.StaticVriable;

public class Person {

    private String name;
    private static int count = 0;

    public Person(String n) {
        name = n;
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Trang");
        Person p2 = new Person("Tri");
        Person p3 = new Person("Dep");
    }
}
