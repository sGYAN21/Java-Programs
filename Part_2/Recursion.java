import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        System.out.println(factorialIterative(num));
        System.out.println(factorialRecursion(num));
    }
    public static long factorialIterative(int num)
    {
        long result=1;
        for(int i=1;i<=num;i++)
            result= result*i;

        return result;
    }
    public static long factorialRecursion(int num)

    {
        if(num==1 || num==0)
            return 1;

        return num*(factorialRecursion(num-1));
    }
}
