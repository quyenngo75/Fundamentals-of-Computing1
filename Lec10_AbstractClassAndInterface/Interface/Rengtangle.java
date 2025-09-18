package Lec10_AbstractClassAndInterface.Interface;

public class Rengtangle implements IShape, IColor {

    @Override
    public void fillColor() {
        System.out.println("Da to mau");
    }

    public void drawShape() {
        System.out.println("Da ve ");
    }
}
