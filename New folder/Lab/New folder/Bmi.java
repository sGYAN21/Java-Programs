
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
    System.out.println("ENTER THE WEIGHT");
    Scanner SC= new Scanner(System.in);
    double WEIGHT =SC.nextDouble();
    System.out.println("enter the height");
    double HEIGHT= SC.nextDouble(); 
    
    double BMI=((WEIGHT)/(HEIGHT*HEIGHT));
    System.out.println("BMI:"+BMI);


        
    }
    
}
