import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find Absolute value : ");
        int num= input.nextInt();
        int value = num<0?(-1*num):(1*num);
        System.out.println("The Absolute value is : "+ value );
    }
}
