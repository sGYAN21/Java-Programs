//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

public class functionPattern {
    public static void main(String[] args) {
        printPattern();
    }
    public static void printPattern()
    {
        int i=0;
        while(i<5)
        {
            System.out.print("*");
            int j=0;
            while(j<i)
            {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
