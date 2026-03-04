import java.util.Scanner;

public class Emailstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String email=sc.next();
        String result=" ";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i) =='@'){
                break;
            }else{
                result+=email.charAt(i);
            }
            


        }
        System.out.println(result);
        
    }
    
}
