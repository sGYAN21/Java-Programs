import java.util.Scanner;

public class patternTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the columns :");
        int number = input.nextInt();
        printPattern(number);
        System.out.println();
        printPattern1(number);
    }
    public  static void printPattern(int number)
    {
        int i=0;
        while (i<number)
        {
            int j=0;
            while (j<number-i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public  static void printPattern1( int number)
    {
        int i=0;
        while (i<number)
        {
            int j=0;
            while (j<=number-i)
            {
                System.out.print("  ");
                j++;
            }
            int k=0;
            while (k<=i)
            {
                System.out.print(" *");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
