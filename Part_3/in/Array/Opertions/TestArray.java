package in.Array.Opertions;

public class TestArray {
    public static void main(String[] args) {
        ArrayOper operation = new ArrayOper(new int[] {1,3,5,9});
        ArrayOper.Statistics statistics = operation.new Statistics();
        System.out.println(statistics.mean());
    }
}
