import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in Meters :");
        float height =sc.nextInt();
        System.out.println("Enter the weight in kGs:");
        float weight = sc.nextFloat();
        float bmi = weight/(height + height);
        System.out.println("bmi is :" +bmi);
        sc.close();

    }
}