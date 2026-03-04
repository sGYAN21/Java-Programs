import java.util.Scanner;

public class Primewithoutloops {
    public static void main(String[] args) {
        System.out.println("enter the num");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int last;
        if(num==1){
            System.out.println("prime not");
        }
        if(num==2){
            System.out.println("prime no");
        }
        int m=num;
        if(num>2){
            last=num%10;
            if(last%2==0){
                System.out.println("not prime");
            }else{
                System.out.println("prime");
            }
        }

    }
    
}
