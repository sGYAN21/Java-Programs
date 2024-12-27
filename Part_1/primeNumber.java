import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }
    public static boolean isPrime( int num)
    {
        int i=2;
        while(i<num)
        {
            if(num%i==0)
            {
                return false;
            }
            i++;
        }
        return true;
    }

}
