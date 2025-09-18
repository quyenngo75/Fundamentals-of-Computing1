package Lec10_AbstractClassAndInterface.Interface;

public class Processor {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.drawShape();
        circle.fillColor();
        Rengtangle rengtangle = new Rengtangle();
        rengtangle.drawShape();
        rengtangle.fillColor();
    }
}
