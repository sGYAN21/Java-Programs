import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4-digit pin code :");
        int pin=sc.nextInt();
        if(pin!=1234)System.out.println("Check your pin...");
        System.out.println("Enter the amount ");
        int amount=sc.nextInt();
        System.out.println("Enter the choice \n1.Withdrawl\n2.Balance\n3.Deposit");
        int choice=sc.nextInt();
        
        switch(choice)
        {
           case 1:
           
           System.out.println("Enter Amount");
           int amount1= sc.nextInt();
           if(amount1>amount)
           {
           System.out.println("Insufficient Balance");
           }
           else{
           System.out.println("Left amount ="+(amount-amount1));
           }
           break;
           case 2:
           System.out.println("Balance "+amount);
           break;
           case 3:
           System.out.println("Enter amount you want deposit");
           int amount2=sc.nextInt();
           System.out.println("Your Balance ="+(amount+amount2));
           break;
           default:
           System.out.println("Invalid Transection");
        }
        sc.close();
    }
    }
    

