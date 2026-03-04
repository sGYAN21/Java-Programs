import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=sc.nextInt();
        int j=0;
        int i=0;
        while(count!=0){
            count=count/10;
            j++;
        }
        System.out.println("no of digit:"+j);
    }
    
}
