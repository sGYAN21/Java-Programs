package in.Polymorphism;

public class OverLoading {
    public int add(int a, int b) {
        return a + b;
    }


    public String add(String a,String b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        OverLoading overload = new OverLoading();
        int sum = overload.add(3,4);
        System.out.println(overload.add(5,sum));
        overload.add("a","b");
    }

}
