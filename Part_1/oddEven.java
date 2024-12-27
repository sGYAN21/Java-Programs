import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check the odd/Even: ");
        int num = input.nextInt();
        if( num%2==0)
        {
            System.out.print("Number "+ num + " is Even");
        }
        else {
            System.out.print("Number "+ num + " is odd");
        }
    }
}
