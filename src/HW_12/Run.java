package HW_12;

public class Run {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(6, 4);
        Square square = new Square(3);

        Shape[] shapes = { circle, triangle, square };

        System.out.printf("Площа кола: %.2f%n", circle.getArea());
        System.out.printf("Площа трикутника: %.2f%n", triangle.getArea());
        System.out.printf("Площа квадрата: %.2f%n", square.getArea());

        System.out.println(" ");

        ShapeAreaCalculator calculator = new ShapeAreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.printf("Сумарна площа фігур: %.2f%n", totalArea);
    }
}