import java.util.Scanner;
public class Areaofcircle {
    public static void main(String[] args) {
    Scanner Obj=new Scanner(System.in);
    System.out.println("ENTER RADIUS OF CIRCLE");
    double radius= Obj.nextDouble();   
    
    double area =Math.PI*(radius*radius);
     
     System.out.println(" the area of circle:"+area);
        
    }
    
}
