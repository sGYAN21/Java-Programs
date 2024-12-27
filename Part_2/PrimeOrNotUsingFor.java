import java.util.Scanner;

public class PrimeOrNotUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num= input.nextInt();
        System.out.println("This Number is Prime "+ prime(num));
    }
    public static boolean prime(int num)
    {
        for(int i=2; i<num;i++)
        {
            if(num%i==0)
              return false;
        }
        return true;
    }
}
