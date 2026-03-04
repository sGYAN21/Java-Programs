import java.util.Scanner;

public class Function_armstrong {
    static int arms (int num,int arm){
        int count=0;
        int v=num;
    
        while(num!=0){
            
            int dig=num%10;
            count++;
            num=num/10;



        }
        while(v!=0){
            int rem=v%10;
            arm+=Math.pow(rem,count);
            v=v/10;

        }
        return arm;

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        
        
        int temp=num;
        int arm=0;
        int r=arms(num,arm);
        if(r==temp){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
        
        
        
       
    }
    
}
