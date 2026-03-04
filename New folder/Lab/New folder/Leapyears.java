import java.util.Scanner;

public class Leapyears {
    
    public static void main(String[] args) {
        Scanner year =new Scanner(System.in);
        System.out.println("enter the year");
        int y= year.nextInt();
        if((y%4)==0){
            if((y%100)==0){
                if((y%400)==0){
                    System.out.println("leap year");
                }
                else{
                    System.out.println("not leap year");
                }
            }
            else{
                System.out.println("not leap year");
            
            }
        }
        else{
            System.out.println("NOT LEAP YEAR");
        }
    }
}
    
