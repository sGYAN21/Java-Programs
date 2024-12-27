import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Set your password:\n");
        String password;
        do {
            System.out.println("Enter your Password: ");
            password= input.nextLine();
        }while (!isValidPassword(password));
        System.out.println("Your password is valid");
    }
    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }

}
