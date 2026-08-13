package HW_12;

public class Square implements Shape {

    private final double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}