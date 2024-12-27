import java.util.Scanner;

public class MonthByDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number:");
        int monthNum = input.nextInt();
        System.out.println(getMonthName(monthNum));

    }

    public static String getMonthName(int monthNum) {
        return switch (monthNum) {
            case 1 -> "January";
            case 2 -> "FEBRUARY";
            case 3 -> "MARCH";
            case 4 -> "APRIL";
            case 5 -> "MAY";
            case 6 -> "JUNE";
            case 7 -> "JULY";
            case 8 -> "AUGUST";
            case 9 -> "SEPTEMBER";
            case 10 -> "OCTOBER";
            case 11 -> "NOVEMBER";
            case 12 -> "DECEMBER";
            default -> "Invalid number";
        };
    }
}
