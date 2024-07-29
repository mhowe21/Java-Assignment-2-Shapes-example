import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // This program gets the input from the user on which shape they want to
        // Calculate area and volume for.
        userInput();
    }

    // this method gets the user input and sends it to the Shape interface
    public static void userInput() {
        Boolean continueRunning = true;
        Scanner sc = new Scanner(System.in);

        // this loop runs until the user decides to exit the program it should also
        // check if the input is valid
        do {
            // this prints the menu of shapes options
            System.out.println("Enter the number of the shape you want to calculate: ");
            System.out.println("1. Rectangle");
            System.out.println("2. Cube or rectangular prism");
            System.out.println("3. Sphere");
            System.out.println("4. Cylinder");
            try {
                int choice = sc.nextInt();
                // this switch case gets the inputs for the different shapes and sends it to the
                // Shape interface
                switch (choice) {
                    // Rectangle shape methods
                    case 1:
                        System.out.println("Enter the length of the rectangle: ");
                        double length = sc.nextDouble();
                        System.out.println("Enter the width of the rectangle: ");
                        double width = sc.nextDouble();
                        Shape rectangle = new Rectangle(length, width);
                        System.out.println("The area of the rectangle is: " + rectangle.getArea());
                        break;
                    // cube or rectangular prism methods
                    case 2:
                        System.out.println("Enter the length of the cube or rectangular prism: ");
                        double cubeLength = sc.nextDouble();
                        System.out.println("Enter the width of the cube or rectangular prism: ");
                        double cubeWidth = sc.nextDouble();
                        System.out.println("Enter the height of the cube or rectangular prism: ");
                        double cubeHeight = sc.nextDouble();
                        Shape cuboid = new Cuboid(cubeLength, cubeWidth, cubeHeight);
                        System.out.println("The area of the cube or rectangular prism is: " + cuboid.getArea());
                        System.out.println("The volume of the cube or rectangular prism is: " + cuboid.getVolume());
                        break;
                    // sphere shape methods
                    case 3:
                        System.out.println("Enter the radius of the sphere: ");
                        double radius = sc.nextDouble();
                        Shape sphere = new Sphere(radius);
                        System.out.println("The area of the sphere is: " + sphere.getArea());
                        System.out.println("The volume of the sphere is: " + sphere.getVolume());
                        break;
                    // cylinder shape methods
                    case 4:
                        System.out.println("Enter the radius of the cylinder: ");
                        double cylinderRadius = sc.nextDouble();
                        System.out.println("Enter the height of the cylinder: ");
                        double cylinderHeight = sc.nextDouble();
                        Shape cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                        System.out.println("The area of the cylinder is: " + cylinder.getArea());
                        System.out.println("The volume of the cylinder is: " + cylinder.getVolume());
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
            }
            // this catches the exception if the input is invalid
            catch (Exception e) {
                System.out.println("Invalid input");
                // clear the scanner
                sc.next();

            }

            System.out.println("Do you want to continue? (y/n)");
            // ask the user if they want to continue conver them to uppercase so acceptable
            // options are Y or YES
            String answer = sc.next();
            answer = answer.toUpperCase();
            if (answer.equals("Y") || answer.equals("YES")) {
                continueRunning = true;
                // exit if the user gives a diffrent value than y or yes
            } else {
                System.out.println("Goodbye!");
                // break the loop
                continueRunning = false;
                // close the scanner at the end of the program
                sc.close();
            }
        } while (continueRunning);

    }
}
