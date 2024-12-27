import java.util.Scanner;

public class relation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Driving Licence Portal");
        int age = input.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible");
        }
        else
        {
            System.out.println("Not eligible");
        }
    }
}
