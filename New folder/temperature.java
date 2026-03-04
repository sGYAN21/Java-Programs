import java.util.Scanner;

 public class temperature  {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float temp =sc.nextFloat();
        float tempcelcius =((temp*9)/5 +32);
        System.out.println("celcius temperature"+tempcelcius);
        sc.close();
    }
 }