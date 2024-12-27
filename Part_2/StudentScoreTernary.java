import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Score of the Student : ");
        int score= input.nextInt();
        String level= score>80?"High": (score > 50? "Moderate" :"Low"  );
        System.out.println("The Score is " + level);
    }
}
