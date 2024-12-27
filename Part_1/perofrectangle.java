import java.util.Scanner;

public class perofrectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of rectangles");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        System.out.println("the perameter of rectangles"+(a+b+c+d));
    }
}
