import java.util.Scanner;

public class Fabonacciseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int firstterm=0;
        int secondterm=1;
        System.out.println("Fibonacci series"+firstterm+","+secondterm);
        for(int i=2;i<num;i++){
            int nextterm=firstterm+secondterm;
            System.out.println(","+nextterm);
            firstterm=secondterm;
            secondterm=nextterm;
        }
    }
}
