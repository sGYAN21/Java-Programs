import java.util.Scanner;

public class functionFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println("The factorial of "+ number+ " is = "+ factorial(number)); ;
    }
    public static long factorial( int fact)
    {

        if (fact<2)
        {
            return 1;
        }
        else {
            int i=1;
            long sum=1;
            while (i <= fact) {
                sum = sum * i;
                i++;
            }
            return sum;
        }
    }
}
