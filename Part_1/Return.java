import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        System.out.println("Welcome\n");
        int first = readNumber();
        int second = readNumber();
        System.out.println(sum(first, second));
    }
    public static int readNumber() //function 1
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        return number;
    }

    public static int sum(int a, int b) // function 2
    {
    return (a+b);
    }
}
