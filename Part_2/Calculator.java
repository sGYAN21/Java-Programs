import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator  : ");
        System.out.println("Enter the number 1st : ");
        int num1= input.nextInt();
        System.out.println("Enter the number 2nd : ");
        int num2= input.nextInt();
        System.out.println("Enter the Operator to be perform : ");
        String operator = input.next();

    int result= switch (operator) {
        case "+"-> num1+num2;
        case "-"-> num1-num2;
        case "*"-> num1*num2;
        case "/"-> num1/num2;
        default -> -1;
        };
        System.out.println("Your answer is "+result);
    }
}
