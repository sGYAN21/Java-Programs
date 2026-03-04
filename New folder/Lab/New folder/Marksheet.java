import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.nextLine();
        System.out.println("enter the class");
        int  std = sc.nextInt();
        System.out.println("enter the five subjects marks");
        int maths_m = sc.nextInt();
        int english_m = sc.nextInt();
        int hindi_m = sc.nextInt();
        int physics_m = sc.nextInt();
        int chemistry_m = sc.nextInt();
        int total_average =0;
        System.out.print("enter no of subjects");
        int noofsubjects = sc.nextInt();
        total_average=(maths_m+english_m+hindi_m+physics_m+chemistry_m)/(noofsubjects);
        double marks =((maths_m+english_m+hindi_m+physics_m+chemistry_m) /500)*100.0;
        System.out.println("total_average:"+total_average);
        System.out.println("marks"+marks);
        
        
    }
    
}
