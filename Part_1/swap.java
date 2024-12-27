import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1= input.nextInt();
        System.out.print("Enter the number2: ");
        int num2=input.nextInt();
        System.out.println(" Before Swap number1: "+num1+ " number2: " + num2);
        int temp =num1;
        num1=num2;
        num2=temp;
        System.out.print("After Swap number1: " + num1+ " number 2: "+ num2 );
    }
}
