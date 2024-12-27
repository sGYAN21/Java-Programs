import java.util.Random;
import java.util.Scanner;
public class DiceOutcome {
    int roll()
    {
        double random = Math.random()*6;
        return (int)Math.ceil(random);

    }

   public static void main(String[] args) {
        DiceOutcome dice = new DiceOutcome();
        for(int i=0;i<10;i++)
        {
            System.out.println(dice.roll());
        }
//        Second method;
//        Random rand = new Random();
//        Scanner input = new Scanner(System.in);
//        String sc;
//        do {
//            int randomNum= rand.nextInt(6)+1;
//            System.out.println("the value of Dice : "+ randomNum);
//            System.out.println("You want again roll the dice : Yes/No ");
//             sc= input.nextLine();
//        }while (sc.equalsIgnoreCase("yes"));
     }
}
