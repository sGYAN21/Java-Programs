import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        int sal=sc.nextInt();
        if(sal<10000)
        {
            System.out.println("there is no tax");
        }

        sc.close();
    }
}
