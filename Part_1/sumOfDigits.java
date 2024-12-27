import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num= input.nextInt();
        int sum= sumOfDigit(num);
        System.out.println("The sum of "+ num + " is "+ sum);
    }
    public static int sumOfDigit(int number)
    {
        int remainder;
        int sum=0;
        while (number!=0)
        {
            remainder=number%10;
            number= number/10;
            System.out.println("The remainder is : "+ remainder);
            sum= sum+remainder;
        }
        return sum;
    }
}
