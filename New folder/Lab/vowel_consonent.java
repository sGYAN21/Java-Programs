import java.util.Scanner;

public class vowel_consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char name = sc.next().charAt(0);
        // char letter=name.toLowerCase();
        switch(name){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("Your Letter is a Vowel..");
            break;
            default:
            System.out.println("Your Letter is a Constant...");
        }

        sc.close();
    }
    
}
