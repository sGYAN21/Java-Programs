package in.challenge87;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int first = input.nextInt();
        int second = input.nextInt();
        try {
            int result = first/second;
            System.out.printf("Result is : %d", result);
        }catch (ArithmeticException exception)
        {
            if (exception.getMessage().equals("/ by Zero"))
            {
                System.out.println("Divide by zero occurred");
            }
            else
                throw exception;
        }
    }
}
