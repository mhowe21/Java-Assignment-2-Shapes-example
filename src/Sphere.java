public class Sphere implements Shape {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
