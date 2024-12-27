import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNum= rand.nextInt(100);
        System.out.println(randomNum);
        int num1;
        do{
            System.out.println("Guess the number : ");
            num1=input.nextInt();
        }while(!isGuess(num1,randomNum));
        System.out.println("You Successfully Guessed the number  ");
    }
    public static boolean isGuess(int num1, int randomNum)
    {
        return (num1==randomNum);
    }
}
