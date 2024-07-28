public class App {
    public static void main(String[] args) throws Exception {
        // create a rectangle object that takes in the width and height

        Shape rectangle = new Rectangle(2,2);
        System.out.println("The area of the rectangle is: " +rectangle.getArea());
        System.out.println("The perimeter of the rectangle is: " +rectangle.getPerimeter());

        Shape cylinder = new Cylinder(2,2);
        System.out.println("The area of the cylinder is: " +cylinder.getArea());
        System.out.println("The perimeter of the cylinder is: " +cylinder.getPerimeter());
        System.out.println("The volume of the cylinder is: " +cylinder.getVolume());
    }
}
