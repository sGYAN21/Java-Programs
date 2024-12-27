import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ticket Discount Calculator");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you Female? (True/false): ");
        boolean isFemale = input.nextBoolean();
        if (age<5)
        {
            System.out.print("75% discount");
        } else if (isFemale )
        {
            System.out.print("50% Discount");
        }
        else if (age>60 && !isFemale)
        {
            System.out.print("25% Discount");
        }
        else
        {
            System.out.println("no Discount");
        }
    }
}
