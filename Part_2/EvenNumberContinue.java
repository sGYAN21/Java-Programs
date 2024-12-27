import java.util.Scanner;

public class EvenNumberContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Range number");
        int num = input.nextInt();
        for (int i = 2; i < num; i++) {
            if (i % 2 != 0)
                continue;
            System.out.print(i + "\t");
        }
    }
}
