import java.util.Scanner;

public class seasons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String month=sc.nextLine();
    
        switch(month){
            case "january":
            case "december":
            case "february":
            System.out.println("winter");
            break;
            case "march":
            case "april":
            case "may":
            case "june":
            case "july":
            case "august":
            case "september":
            case "october":
            case "november":

        }
        sc.close();
    }
    
}
