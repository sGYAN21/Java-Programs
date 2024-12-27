import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        System.out.println("table");
    int number = readNumber();
        System.out.println("The table of "+ number + " is \n" );
        table(number);
    }
//    INPUT FUNCTION
        public static int readNumber( )
        {
            Scanner input = new Scanner(System.in);
            return input.nextInt();
        }
//        TABLE Function
        public static void table (int num)
        {
            int i=1;
            while (i<=10)
            {
                System.out.println(num + " X "+ i + " = " + num*i);
                i++;
            }
        }

}
