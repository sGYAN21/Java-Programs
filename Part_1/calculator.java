import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number 1 :");
        int num1 = input.nextInt();
        System.out.print("Enter the number 2 :");
        int num2 = input.nextInt();
        System.out.println("add: " +(num1+num2));
        System.out.println("sub: " +(num1-num2));
        System.out.println("mul: " +(num1*num2));
        System.out.println("div: " +(num1/num2));
        System.out.println("remainder: " +(num1%num2));
    }
}
