import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first No.");
      int value1= sc.nextInt();
      System.out.println("Enter the operator");
      char value2=sc.next().charAt(0);
      System.out.println("Enter the Second No.");
    int value3=sc.nextInt();
        switch(value2)
        {
            case '+':
            System.out.println( +value1+ " " +value2+ " " +value3+" = "+(value1+value3));
            break;
            case '-':
            System.out.println(+value1+" "+value2+" "+value3+" = "+(value1-value3));
            break;
            case '*':
            System.out.println(+value1+" "+value2+" "+value3+" = "+(value1*value3));
            break;
            case '/':
            System.out.println(+value1+" "+value2+" "+value3+" = "+(value1/value3));
            break;
            default:
            System.out.println("Invalid operator");

        }
        sc.close();
    }
    
}
