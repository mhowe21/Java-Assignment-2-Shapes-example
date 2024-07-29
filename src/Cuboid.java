// this class implements the Shape interface and gives the details of the Cuboid shape (length, width, height)
public class Cuboid implements Shape {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * ((length * width) + (length * height) + (width * height));
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }

}
