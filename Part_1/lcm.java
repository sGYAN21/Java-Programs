import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        int first = input.nextInt();
        System.out.println("enter the number 2 :");
        int second = input.nextInt();
        int lcm = Lcm(first,second);
        System.out.println("The lcm of two number is " + lcm);
    }
    public static int Lcm(int first, int second)
    {
        int i=1;
        while (true)// i<=second
        {
            int factor=first*i;
            if(factor%second==0)
            {
                return factor;
            }
            i++;
        }
//        return 0;// unreachable
    }
}

