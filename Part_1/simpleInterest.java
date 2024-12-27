import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the principle ");
        double principle = input.nextDouble();
        System.out.print("enter the rate: ");
        double rate = input.nextDouble();
        System.out.print("enter the time: ");
        double year = input.nextDouble();
        System.out.println("The Simple Interest: "+(principle*rate*year)/100);

    }
}
