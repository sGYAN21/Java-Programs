import java.util.Scanner;

public class minTwoNumberTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1= input.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = input.nextInt();
        minTwoNumberTernary ternary = new minTwoNumberTernary();
        int min = ternary.min(num1,num2);
        System.out.println("The Minimum number is : "+  min);

    }
      public int min(int num1,int num2)
        {

            return num1<num2?num1:num2;
        }
}
