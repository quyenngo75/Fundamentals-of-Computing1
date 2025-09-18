package Lec11_Encapsultation.Exist;

public class Person {

    public String name;
    private double weight;

    public void setWeight(double weight) {
        if (this.weight < 0) {
            System.out.println("Weight error");
        } else {
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Person a = new Person();
        a.setWeight(-10.0);
    }
}
