package in.questions;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number is : ");
        int num= input.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("   ");
            }
            for (int j=0;j<num-i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
