package HW_12;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}