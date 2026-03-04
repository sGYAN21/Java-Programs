public class Leapyear {
    public static void main(string[] args) {
        Scanner year =new Scanner(System.in);
        System.out.println("enter the year");
        double length= year.nextDouble();
        if((year%4)==0){
            if((year%100)==0){
                if((year%400)==0){
                    System.out,println("leap year");
                }
                else{
                    System.out.println("not leap year");
                }
            }
            else{
                System.out.println("not leap year");
            
            }
        }
        else{
            System.out.println("NOT LEAP YEAR");
        }
    }
}