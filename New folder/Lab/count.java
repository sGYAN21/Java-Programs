import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int no= sc.nextInt();
        int a=0;
        while(no!=0)
        {
            no=no/10;
            a++;
        }
        System.out.println("the digits are : "+a);
        sc.close();
    }
    
}
