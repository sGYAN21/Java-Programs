import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        System.out.println("the fibonacci series upto "+  number);
        fibonacci(number);
    }
    public static void fibonacci( int num)
    {
        if (num<0) return;
        System.out.print("0\t");
        if(num==0) return;
        System.out.print("1\t");
        int first =0, second = 1;

        while (first + second<=num)
        {
        int  third= first+second;
            System.out.print(third+"\t");
        first=second;
        second= third;

        }

    }
}
