import java.util.Scanner;

public class weekend_weekday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day of the week ");
        String day = sc.nextLine();
        
        switch(day)
        {
            case "saturday":
            case "sat":
            case "sunday":
            case "sun":
            System.out.println("Weekend");
            break;
            default:
            System.out.println("weekday");
            break;
        }
        sc.close();

    }
}
