import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number= input.nextInt();
//        int copy= number;
//        int intCount=count(number);
//        int sum=0;
//        while (number!=0)
//        {
//            int temp=number%10;
//            sum= sum+ pow(temp,intCount);
//            number=number/10;
//        }
//        System.out.println("The "+copy+ " is "+ isArmStrong(sum,copy)+ " Armstrong Number ");
        System.out.println("the "+ number+ " is "+ isArmStrong(number)+ " Armstrong Number");
   }
    public static int count ( int number)
    {

        int count=0;
        while(number!=0)
        {
            count++;
            number= number/10;
        }
        return count;
    }
    public static int pow(int number, int count)
    {
        int result=1;
        int i=1;
        while (i<=count)
        {
              result= result*number;
            i++;
        }
        return result;
    }
    public  static  boolean isArmStrong( int num1)
    {
        int copy= num1;
        int digits= count(num1);
            int finalNumber=0;
        while(num1>0)
        {
            int last=num1%10;
            num1/=10;
            finalNumber+=pow(last,digits);
        }
        return finalNumber==copy;
    }


}
