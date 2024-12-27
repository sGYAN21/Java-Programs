import java.util.Scanner;

public class palinDrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();

        System.out.println("The "+ number+ " is "+ isPalindrome(number)+ " Palindrome");

    }
    public static boolean isPalindrome( int number)
    {
        int copy=number;
        int rev=0,remainder;
        while(number!=0)
        {
            remainder=number%10;
            rev= (rev*10)+remainder;
            number/=10;
        }
        return copy==rev;
    }
}
