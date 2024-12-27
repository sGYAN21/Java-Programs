import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the height of the triangle");
        double height = input.nextDouble();
        System.out.println("Enter the base of the triangle");
        double base = input.nextDouble();
        System.out.println("the area of triangle: " +(0.5*base*height));
    }
}
