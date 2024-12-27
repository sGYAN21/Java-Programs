package in.questions;

import java.util.Scanner;

import static java.lang.Math.pow;

public class series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = input.nextInt();
        int x= 2;
        double sum=0;
        for(int i=1;i<=num;i++) {
            sum += ((i%2==0)?(-1):1)*(square(x, (2 * i - 1))) / factorial(2 * i - 1);
        }
            System.out.println("sum = "+sum);
    }
    public  static int factorial(int x)
    {
        if (x==0||x==1)
            return  1;
        else
        {
            return  x* factorial(x-1);
        }

    }
    public static double square(int num,int x)
    {
        return pow(num,x);
    }
}
