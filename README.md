# Java Shapes Program

This is a Java program that calculates and outputs the surface area, perimeter, and volume of various shapes. The program uses an interface called `Shape` that includes methods for calculating these properties. Each shape is represented by a separate class that implements the `Shape` interface.

## Classes

The program includes the following classes:

- `Shape`: This is an interface that includes methods for calculating the surface area, perimeter, and volume.
- `Circle`, `Square`, `Cube`, `Cylinder`, and `Rectangle`.: These are classes that represent specific shapes. Each of these classes implements the `Shape` interface and provides its own implementation of the methods as calcualtion will be diffrent for each object shape.

## Compilation

Before running the program, you need to compile the classes. Depending on your IDE, you may need to do this manually using the `javac` command. Here's how you can compile the classes from the command line:

```bash
javac Shape.java
javac Circle.java
javac Rectangle.java
javac Cube.java
# ... and so on for the other shape classes
```

## Execution

After compiling the classes, you can run the main application. The main application creates instances of the shapes, calculates their properties, and outputs the results.

# References

Metropolitan Community College. (n.d.). Perimeter, Area, Volume. Retrieved from [https://mcckc.edu/tutoring/docs/blue-river/math/basic/Perimeter_Area_Volume.pdf](https://www.citationmachine.net/apa)
