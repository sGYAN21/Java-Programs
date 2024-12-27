import java.util.Scanner;

public class sumOddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number range: ");
        int least = input.nextInt();
        int highest = input.nextInt();
        System.out.println("the sum of odd numbers is : "+ sumOdd( least, highest));;
    }
    public static int  sumOdd(int low , int high)
    {
        int sum = 0;
        while (low <=high)
        {
            if (low%2!=0) {
                System.out.println(" The odd Number is: " + low);
                sum = sum + low;
            }
                low++;
        }
        return sum;
    }
}
