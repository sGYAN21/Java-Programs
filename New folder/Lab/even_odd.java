import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the starting range of number :");
        int start=sc.nextInt();
        System.out.println("Enter the ending range of numbers :");
        int end=sc.nextInt();
        for(int i =start;i<=end;i++)
        {
            if(i%2==0){
            System.out.println("even=" +i);
            }
            else
            {
                continue;
            }
        }
        for(int i =start;i<=end;i++)
        {
            
                if(i%2!=0)
                {
                    System.out.println("Odd ="+i);
                }
            
        }
        sc.close();
        
    }
    
}
