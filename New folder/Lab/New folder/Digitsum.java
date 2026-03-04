import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args) {
        
    
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the no");

     int n=sc.nextInt();
     int sum=0;
     int i=0;
     int a=0;
     
      while(n!=0) {

        a=n%10;
        n=n/10;
        
        sum=sum+a;
        
        

      }
     System.out.println("the sum of:" +sum);

    }

    
}
