import java.util.Scanner;

public class ATMMachine {
    static class ATM
    {
        float Balance;
        int PIN=1234;
        public void checkPin()
        {
            System.out.println("Enter Your PIN:");
            Scanner input = new Scanner(System.in);
            int Entered_pin= input.nextInt();
            if(PIN==Entered_pin)
            {
              menu();
            }
            else {
                System.out.println("Enter Your Valid Pin :");
                menu();
            }

        }
        public void menu()
        {
            System.out.println("Enter Your Choice: ");
            System.out.println("1. Check A/c Balance: ");
            System.out.println("2. WithDraw Money: ");
            System.out.println("3. Deposit Money ");
            System.out.println("4. Exit");
            Scanner input = new Scanner(System.in);
            int opt = input.nextInt();
            if(opt==1)
            {
                checkBalance();
            } else if (opt==2) {
                withDrawMoney();
            }
            else if(opt==3)
            {
                depositMoney();
            } else if (opt==4) {
             return;
            }
            else {
                System.out.println("Enter the valid choice");
            }
        }

        public void checkBalance()
        {
            System.out.println("Balance: "+ Balance );
            menu();
        }
        public void withDrawMoney()
        {
            System.out.println("Enter Amount to Withdraw:");
            Scanner input = new Scanner(System.in);
            float amount = input.nextFloat();
            if(amount>Balance)
            {
                System.out.println("Insufficient Balance");
            }
            else {
                Balance= Balance-amount;
                System.out.println("Money Withdrawal Successful");
            }
            menu();
        }
    public void  depositMoney()
    {
        System.out.println("Enter the amount : ");
        Scanner input = new Scanner(System.in);
        float amount = input.nextFloat();
        Balance= Balance+amount;
        System.out.println("Money Deposit Successfully");
        menu();
        }

    }

    public static void main(String[] args) {
      ATM obj = new ATM();
      obj.checkPin();
    }
}