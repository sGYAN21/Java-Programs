import java.util.Scanner;

public class percentage{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a student name");
        String name = sc.next();
        System.out.println("enter a class");
        int class1 = sc.nextInt();
        System.out.println("enter physics marks");
        int physics = sc.nextInt();
        System.out.println("enter chemistry marks");        
        int chemistry = sc.nextInt(); 
        System.out.println("enter Maths marks"); 
        int Maths = sc.nextInt(); 
        System.out.println("enter Biology marks"); 
        int Biology = sc.nextInt();  
        System.out.println("enter English marks");
        int English = sc.nextInt();
        float marks = physics+chemistry+Maths+Biology+English;
        System.out.println("Average marks of Student"+marks/5);
        sc.close();
     }
    }
