import java.util.Scanner;

public class Charactercount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        StringBuilder sb=new StringBuilder(str);
        int count=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)== ch) {
                count++;

            }
        }
        System.out.println("number of occurence of" +ch+ "in the string"+count);


    
        
        
    }
    
}
