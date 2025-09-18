package Lec8_ObjectAndClass;

public class Processor {

    public static void main(String[] args) {
        Car myCar = new Car("Lambogini", 2020);
        Car myCar2 = new Car("Ferrari", 2015);
        myCar.disPlayDetails();
        myCar2.disPlayDetails();
    }
}
