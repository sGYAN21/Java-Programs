import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        System.out.println("The reverse number of "+ number + " is "+ rev(number)) ;
    }
    public static int rev(int num)
    {
        int remainder;
        int reverse = 0;
        while(num!=0)
        {
            remainder= num%10;
            num=num/10;
            reverse = reverse*10 + remainder;
        }
        return reverse;
    }


}
