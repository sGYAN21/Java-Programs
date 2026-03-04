import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of k");
       
       int K=sc.nextInt();
       if(K%2==0){
        System.out.println("even");
       }
       else{
        System.out.println("odd");
       }
       sc.close();
    }
    
}
