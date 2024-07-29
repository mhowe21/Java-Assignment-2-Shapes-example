import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        userInput();
    }

    public static void userInput() {
        Boolean continueRunning = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the shape you want to calculate: ");
        System.out.println("1. Rectangle");
        System.out.println("2. Cube or rectangular prism");
        System.out.println("3. Sphere");
        System.out.println("4. Cylinder");
        int choice = sc.nextInt();

        do {
            switch (choice) {
                case 1:
                    System.out.println("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.println("Enter the width of the rectangle: ");
                    double width = sc.nextDouble();
                    Shape rectangle = new Rectangle(length, width);
                    System.out.println("The area of the rectangle is: " + rectangle.getArea());
                    System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());
                    break;

                case 2:
                    System.out.println("Enter the length of the cube or rectangular prism: ");
                    double cubeLength = sc.nextDouble();
                    System.out.println("Enter the width of the cube or rectangular prism: ");
                    double cubeWidth = sc.nextDouble();
                    System.out.println("Enter the height of the cube or rectangular prism: ");
                    double cubeHeight = sc.nextDouble();
                    Shape cuboid = new Cuboid(cubeLength, cubeWidth, cubeHeight);
                    System.out.println("The area of the cube or rectangular prism is: " + cuboid.getArea());
                    System.out.println("The perimeter of the cube or rectangular prism is: " + cuboid.getPerimeter());
                    System.out.println("The volume of the cube or rectangular prism is: " + cuboid.getVolume());
                    break;
                case 3:
                    System.out.println("Enter the radius of the sphere: ");
                    double radius = sc.nextDouble();
                    Shape sphere = new Sphere(radius);
                    System.out.println("The area of the sphere is: " + sphere.getArea());
                    System.out.println("The perimeter of the sphere is: " + sphere.getPerimeter());
                    System.out.println("The volume of the sphere is: " + sphere.getVolume());
                    break;
                case 4:
                    System.out.println("Enter the radius of the cylinder: ");
                    double cylinderRadius = sc.nextDouble();
                    System.out.println("Enter the height of the cylinder: ");
                    double cylinderHeight = sc.nextDouble();
                    Shape cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                    System.out.println("The area of the cylinder is: " + cylinder.getArea());
                    System.out.println("The perimeter of the cylinder is: " + cylinder.getPerimeter());
                    System.out.println("The volume of the cylinder is: " + cylinder.getVolume());
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

            System.out.println("Do you want to continue? (y/n)");
            String answer = sc.next();
            answer = answer.toUpperCase();
            if (answer.equals("Y") || answer.equals("YES")) {
                continueRunning = true;

            } else {
                System.out.println("Goodbye!");
                continueRunning = false;
                sc.close();
            }
        } while (continueRunning);

    }
}
