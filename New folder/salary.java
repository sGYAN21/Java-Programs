import java.util.Scanner;

public class salary {
    public static void main( String[] args){
      System.out.println("Enter the basic salary");
        Scanner sc = new Scanner(System.in);
        float basic_salary=sc.nextFloat();
        float hra=basic_salary * (30/100);
        float ta=basic_salary * (20/100);
        float da=basic_salary * (10/100);
        int pf=1500;
        float net_salary= basic_salary+hra+ta+da-pf;
        System.out.println("Basic Salary "+basic_salary);
        System.out.println("HRA" +hra);
        System.out.println("Ta" +ta);
        System.out.println("Da" +da);
        System.out.println("Net_salary" +net_salary);
        sc.close();
    }
    
}
