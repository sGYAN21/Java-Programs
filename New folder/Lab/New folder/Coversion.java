import java.util.Scanner;

public class Coversion {
    public static void main(String[] args) {
        System.out.println("enter the value of celcius");
        Scanner sc=new Scanner(System.in);
        float celcius= sc.nextFloat();
        float f =0;
        f=(((9/5)*celcius)+32);
        System.out.println("f:"+f);




    }
    
}
