import java.util.Scanner;;
public class Parameter{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("What the Shape? : tyyy");
        int num=sc.nextInt();
        int num_2=sc.nextInt();
        System.out.println("Enter operation :");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':System.out.println("Your Answer is :"+(num+num_2));
            break;
            case '-':System.out.println("Your Answer is :"+(num-num_2));
            break;
            case '*':System.out.println("Your Answer is :"+(num*num_2));
            break;
            case '%':System.out.println("Your Answer is :"+(num%num_2));
            break;
            default:System.out.println("Wrong OPerstion");
        }
            sc.close();
    }
    
}
