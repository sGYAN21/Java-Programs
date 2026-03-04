import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr the months 1.january 2.febraruary 3. march 4 .april and so on ");
        int month=sc.nextInt();
        switch(month){
            case 1:{
                System.out.println(" january is a month of winter");
                
                break;
            }
            case 2:{
                System.out.println("february is a month of winter");
                
                break;
            }
            case 3:{
                System.out.println("march is a month of summer");
                
                break;
            }
            case 4:{
                System.out.println("april is a month of summer");
                
                break;
            }
            case 5:{
                System.out.println("may is a month of summer");
                break;
            }
            case 6:{
                System.out.println("june is a month of rainy");
                break;
            }
            case 7:{
                System.out.println("JULY is a month of rainy");
                break;
            }
            case 8:{
                System.out.println("august is a month of rainy");
                break;
            }
            case 9:{
                System.out.println("september is amonth of rainy");
                break;
            }
            case 10:{
                System.out.println("october is a month of autumn");
                break;
            }
            case 11:{
                System.out.println("novemberis amonth of autumn");
                break;
            }
            case 12:{
                System.out.println("december is a month of winter");
                break;
            }
            default:{
                System.out.println("invalid choice please enter correct input");
            }
        }
    }
}


        
    
    

