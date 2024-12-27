package in.challenge83;

public class TestShapes {
    public static void main(String[] args) {
       Circle circle = new Circle(5);
       Square square = new Square(10.3);
        System.out.printf("area is Circle %.2f\n", circle.calculateArea());
        System.out.printf("area is Square %f", square.calculateArea());
    }
}
