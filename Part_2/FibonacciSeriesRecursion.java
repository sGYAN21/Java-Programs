import java.util.Scanner;

public class FibonacciSeriesRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = input.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.println(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int num)
    {
        if(num==1)
            return 0;
        else if(num==2)
            return 1;
        else
            return fibonacci(num - 1) + fibonacci(num - 2);
        }

}
