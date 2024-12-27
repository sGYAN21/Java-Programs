import java.util.Scanner;

public class ageGroups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age of person: ");
        int age = input.nextInt();
        if (age<13)
        {
            System.out.print("Child");
        }
        else if (age<20 && age >=13)
        {
            System.out.println("Teenager");
        }
        else if (age>=20 && age <60)
        {
            System.out.println("Adult");
        }
        else {
            System.out.println("Senior");
        }
    }
}
