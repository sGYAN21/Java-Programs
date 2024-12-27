import java.util.Scanner;

public class GreatestNumThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a>b && a>c)
        {
            System.out.print(a + " is greater than " +b+ " and " +c );
        }
        else if (b>a &&b>c)
        {
            System.out.print(b+ " is greater than " +a+ " and "+c);
        }
        else
        {
            System.out.print(c+ " is greater than " +a+ " and " +b);
        }
    }
}
