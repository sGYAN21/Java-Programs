import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number1 :");
        int first = input.nextInt();
        System.out.println("Enter the number2 :");
        int second = input.nextInt();
        int GCD = hcf(first, second);
        System.out.println("The HCF of " + first + " and " + second + " is " + GCD);
    }

    public static int hcf(int first, int second) {
        int gcd = 1;
        int i = 2;
        int least = least(first,second);
        while (i <= least) {
            if ((first%i == 0)&&(second%i==0) ) {
                gcd=i;
            }

            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2)
        {
            if(num1<num2)
         {
             return num1;
         }
              else
              return num2;
         }
}
