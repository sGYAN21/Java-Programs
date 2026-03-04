import java.util.Scanner;

public class first{
    static void greet() {
        System.out.println("Hello User how are you");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        greet();
        sc.close();
    }
}