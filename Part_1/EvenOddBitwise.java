import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        if( (num&1)==0)
        {
            System.out.println("the number "+ num+ " is even");
        }
        else
        {
            System.out.println("the number "+ num+ " is odd");
        }
    }
}
