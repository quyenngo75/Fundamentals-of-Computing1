package Lec10_AbstractClassAndInterface.Interface;

public class Circle implements IShape, IColor {

    @Override
    public void drawShape() {
        System.out.println("Drwaing a circle");
    }

    public void fillColor() {
        System.out.println("Filling the circle with green");
    }

}
