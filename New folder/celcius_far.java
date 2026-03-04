import java.util.Scanner;

public class celcius_far {
    public static void main(String[] args) {
        System.out.println("Enter the temperature :");
        Scanner sc= new Scanner(System.in);
        float celsius=sc.nextFloat();
         float fahrenheit= (celsius * (9/5))+ 32;
         System.out.println("celsius :"+celsius);
         System.out.println("Fahrenheit :"+fahrenheit);
         sc.close();
    }
    
}