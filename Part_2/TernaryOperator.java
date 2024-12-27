import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check the Number : ");
        System.out.println("Enter the 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = input.nextInt();
        int greaterNumber= num1>num2? num1: num2;
        System.out.println(greaterNumber+ " is the greatest number");


    }
}
