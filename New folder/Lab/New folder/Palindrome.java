import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter anumbr");
        int num =sc.nextInt();
        int reverse =0;
        int originalno=num;
        while(num!=0){
            int remender=num%10;
            reverse=reverse*10+remender;
            num=num/10;
        
        
        }
        if(originalno==reverse){
            System.out.println("the number is palindrome");
        }else{
            System.out.println("not palindrome");
        }
           

     
    }
    
    
}
