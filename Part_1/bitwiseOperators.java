import java.util.Scanner;

public class bitwiseOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two Numbers");
        int a= input.nextInt();
        int b= input.nextInt();
        System.out.println("the bitwise AND is: "+ (a&b));
        System.out.println("the bitwise OR is: "+ (a|b));
        System.out.println("the bitwise XOR is: "+ (a^b));
        System.out.println("the bitwise compliment of a= "+ (~a)+"and b= "+~b);
        System.out.println("Left shift of a = "+(a<<1)+ "and b = "+ (b<<1));
        System.out.println("Right shift of a = "+(a>>1)+ "and b = "+ (b>>1));
    }
}
