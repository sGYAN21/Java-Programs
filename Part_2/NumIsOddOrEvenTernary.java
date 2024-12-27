import java.util.Scanner;

public class NumIsOddOrEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ODD/EVEN");
        System.out.println("Enter the number :");
        int num= input.nextInt();
        String result = num%2==0? "Even":"Odd";
        System.out.println("Your Number is "+ result);

    }
}
