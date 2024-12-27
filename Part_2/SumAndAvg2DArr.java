import java.util.Scanner;

public class SumAndAvg2DArr {
    public static void main(String[] args) {
        System.out.println("Description");
        int [][] numArr= ArrayUtility.input2DArray();
        System.out.println("The Sum of 2D array is " + sum(numArr));
        System.out.println("The Average of 2D array is " + avg(numArr));

    }
    public static long sum( int [][] numArr)
    {
        int sum=0;
        int i=0;
        while(i<numArr.length) {
                int j=0;
            while (j < numArr[i].length) {
                sum = sum + numArr[i][j];
            j++;
            }
            i++;
        }
        return sum;
    }

    public static double  avg(int [][] numArr) {
        if(numArr.length==0)
           { return 0; }
        int rows= numArr.length;
        int columns = numArr[0].length;
        double size = rows*columns;
        return sum(numArr)/size;
    }
}
