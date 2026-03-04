import java.util.Scanner;
public class Areaofrectangle {
    public static void main(String[] args) {
        Scanner fish =new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        double length= fish.nextDouble();
        System.out.println("enter the  width of rectangle");
        double width=fish.nextDouble();

        double area= length * width;
        System.out.println("the area of rectangle:"+area);
        
    }
    
}
