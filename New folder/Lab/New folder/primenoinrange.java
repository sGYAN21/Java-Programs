import java.util.Scanner;


public class primenoinrange {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ending point");
        int end=sc.nextInt();
        
        System.out.println("print primeno b/w 1to n");
        
        for(int i=2;i<=end;i++) {
            boolean isprime=true;
            for(int j=2;j<i;j++) {
               if(i%j==0) {
                isprime=false;
                break;
               }
            }    
                
               
                  
            if(isprime){
                System.out.print(i+" ");
            }   

        }
            
    }
     
}
    
    
  

