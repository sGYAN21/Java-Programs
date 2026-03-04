import java.util.Scanner;

public class rectangle {

    public static void main(String[] args){
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter a length");
          int l = scan.nextInt();
          System.out.println("enter a breath");
          int b = scan.nextInt();
          int c = l*b;
          System.out.println("Area of rectangle is :"+c);
          scan.close();
    }
}