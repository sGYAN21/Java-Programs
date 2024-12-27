package in.questions;

import java.util.Scanner;

import static java.lang.Math.pow;

public class series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of nth Term:");
        int num = input.nextInt();
        System.out.println("Enter the value of x is :");
        int x= input.nextInt();
        double sum=0;
        for (int i=1;i<num;i++)
        {
            sum =((i%2==0)?(-1):1)*sum+ pow(x,2*i);
        }
        System.out.println("the sum is : "+ sum);
    }
}
