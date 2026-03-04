import java.util.Scanner;

public class Printweekusinginteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number from 0-7");
        int ch=sc.nextInt();
        switch(ch) {
            case 1:{
                System.out.println("MONDAY");
                break;
           
            }
            case 2: {
                System.out.println("TUESDAY");
                break;
            }
            case 3:{
                System.out.println("wednedsday");
                break;
            }
            case 4:{
                System.out.println("thrusday");
                break;
            }
            case 5:{
                System.out.println("friday");
                break;
            }
            case 6:{
                System.out.println("saturday");
                break;
            }
            case 7:{
                System.out.println("sunday");
                break;
            }

            default:{
                System.out.println("wrong input");
            }
        }
        
    }
    
}

    
