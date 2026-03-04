import java.util.Scanner;
public class Calcuolatoradd { 
    public static void main(String[] args) {
        System.out.println("enter the operation 1 addition 2substraction 3multiplication 4 division ");
        Scanner sc=new Scanner(System.in);
        int operation= sc.nextInt();
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        int c=0;

        switch(operation){
            case 1:{
                System.out.println("addition");
                c=a+b;
                System.out.println("addition"+c);
                break;
            }
            case 2:{
                System.out.println("substraction");
                c=a-b;
                System.out.println("substraction"+c);
                break;
            }
            case 3:{
                System.out.println("multiplication");
                c=a*b;
                System.out.println("multipication"+c);
                break;
            }
            case 4:{
                System.out.println("division");
                c=a/b;
                System.out.println("DIVISION"+c);
                break;
            }
            default:{
                System.out.println("invalid choice please enter correct options");
            }
        }
    }
}


    

