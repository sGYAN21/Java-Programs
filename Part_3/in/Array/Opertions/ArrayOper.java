package in.Array.Opertions;

public class ArrayOper {
    final   private int[] numbers;

    public ArrayOper(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics
    {
            double mean()
            {
                double sum=0;
                for(int number: numbers)
                      sum+=number;
                return sum/ numbers.length;
            }
            double median()
            {
            return 0;
            }

    }

}
