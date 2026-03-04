import java.util.Scanner;

public class student {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the student name");
        String name = scan.nextLine();
        System.out.println("Enter the class");
        int classname = scan.nextInt();

       System.out.println("Subjects");
        System.out.println("Maths");
        int maths = scan.nextInt();
        System.out.println("Chemistry");
        int chem = scan.nextInt();
        System.out.println("Physics");
            int phy = scan.nextInt();


        float obtain = (maths+chem+phy);
        float avg = obtain / 3;
        System.out.println("Name"+name);
        System.out.println("class"+classname);
        System.out.println("Percentage :"+obtain /5);
        System.out.println("The average of marks "+avg);
        scan.close();
        
    }
}
