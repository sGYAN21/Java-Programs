import java.util.Scanner;

public class hollow_tri_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int num= sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i==0||i==num||j==0||j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        sc.close();
    }   
}
