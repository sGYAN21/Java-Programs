import java.util.Scanner;

public class Circle {
    double radius;
    Circle(double radius) {
        this.radius= radius;
    }
    double parameter(double radius) {
        return (double)(2*Math.PI*radius);
    }
        double area(double radius) {
        return (Math.PI*Math.pow(radius,2));
    }

    @Override
    public String toString() {
        return "Circle Props : radius = " + radius +
                "  Circumference is : " + parameter(radius)+
                "  area  " + area(radius);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle");
        double radius = input.nextInt();
        Circle circle = new Circle(radius);
        System.out.println(circle);
    }

}
