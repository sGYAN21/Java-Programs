import java.util.Scanner;
public class CharArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        System.out.println("Enter the size of Array ");
        int size = input.nextInt();
        System.out.println("enter the characters of Array");
        char [] alpha = new char[size];
            System.out.println("Enter the elements: ");
            alpha = input.next().toCharArray();
            for(int i=0;i< alpha.length;i++)
            {
               sb.append(alpha[i]);
            }
        System.out.println(sb);
    }
    }

