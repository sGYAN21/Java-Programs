import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter the principle ");
        float principle = input.nextFloat();
        System.out.print("enter the rate: ");
        float rate = input.nextFloat();
        System.out.print("enter the time: ");
        float year = input.nextFloat();
        System.out.println("Compound Interest : "+(principle * Math.pow((1+rate/100),year)));
    }
}
