import java.util.Scanner;
public class CheckStringIsExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        do {
            System.out.println("Enter the Keyword");
            name= input.nextLine();
            if(name.equalsIgnoreCase("Exit"))
                break;
        }while(true);
        System.out.println("Your are Exited");
    }
}
