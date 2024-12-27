package in.VariableArguments;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println("Hello World ");
        System.out.println(sum(1,2,3));
    }
    public static  int sum(int... a)
    {
        int sum=0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
//    public static int sum(int[] a)
//    {
//        int sum=0;
//        for (int i : a) {
//            sum+=i;
//        }
//        return sum;
//    }
    public static int sum(int a, int b)
    {
        return a+b;
    }

    }