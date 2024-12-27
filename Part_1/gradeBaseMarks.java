import java.util.Scanner;

public class gradeBaseMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the percentage of Student: ");
        int percentage = input.nextInt();
        if (percentage>90)
        {
            System.out.print("Student Grade is A");
        } else if (percentage>75 && percentage<=90 ) {
            System.out.print("Student Grade is B");
        }
        else if (percentage>60 && percentage<=75 ) {
            System.out.print("Student Grade is C");
        }
        else if (percentage>30 && percentage<=60 ) {
            System.out.print("Student Grade is D");
        }
        else
        {
            System.out.println("Student is Fail");
        }

    }
}
