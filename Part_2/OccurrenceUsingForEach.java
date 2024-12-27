import java.util.Scanner;

public class OccurrenceUsingForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr= ArrayUtility.inputArray();
        System.out.println("Enter the number to find the occurrence");
        int num= input.nextInt();
        int occ=0;
        for (int temp:arr)
        {
            if(temp==num)
                occ++;
        }
        System.out.println("The "+ num+" Occurrence is "+ occ);
    }
}
