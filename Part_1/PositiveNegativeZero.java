import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        if(num>0)
        {
            System.out.print("Number is Positive");
        }
        else if (num<0)
        {
            System.out.print("Number is Negative");
        }
        else
        {
            System.out.print("Number is Zero");
        }
    }
}
