import java.util.Scanner;

public class bank {

    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.println("enter your salary");
        int salary = scan.nextInt();
        int a = salary/100;
        int hra = a*30;
        int ta = a*20;
        int da = a*10;
        int pf = 15000;
        int ns = salary+hra+ta+da-pf;
        System.out.println("your net salary is : " +ns);
        scan.close();
    }
    
    }