package in.passBy;

public class TestPassByValue {
    public static void main(String[] args) {
        int x=5;
        int y= 10;
        int sum= add(x,y);
        System.out.printf("%d,%d, %d ",x,y, sum);
    }
    public static int add(int a, int b)
    {
        a+=b;
        return a;
    }

}
