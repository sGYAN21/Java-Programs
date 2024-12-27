package in.challenge85;

public class Calculator {
    public  int add(int x,int y)
    {
        return x+y;
    }
    public  int add(int x, int y, int z)
    {
        return x+y+z;
    }
    public  double add(double x, double y)
    {
        return x+y;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5,6));
        System.out.println(calc.add(5,6,7));
        System.out.println(calc.add(5.1,6.2));

    }
}
