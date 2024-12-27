import java.util.Scanner;

public class SumOfNumbersByUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Description");
        int [] arr= ArrayUtility.inputArray();
        int sum=0;
        for(int num:arr)
        {
            if(num<0)
                continue;
            sum+=num;
        }
        System.out.println("The Sum is "+ sum);
    }
}
