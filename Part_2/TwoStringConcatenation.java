import java.util.Scanner;

public class TwoStringConcatenation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word, word2;
        System.out.println("enter the first String : ");
        word = input.nextLine();
        System.out.println("enter the second String : ");
        word2 = input.nextLine();
        String word3= word.concat(" ").concat(word2);
        System.out.print(word3.toUpperCase());
    }
}
