import java.util.Scanner;

public class Evenoddusingloop {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("enter the starting point");
        int start=SC.nextInt();
        System.out.println("enter the ending point");
        int end=SC.nextInt();
        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.println("even no is:"+i);
            }else{
                System.out.println("odd no is:"+i);
            }
        }
    }
    
}
