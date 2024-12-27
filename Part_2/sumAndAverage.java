import java.util.Scanner;
public class sumAndAverage {
    public static void main(String[] args) {
        System.out.println("Enter the elements of Array");
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("the sum of an Array is: "+ sum(numArray));
        System.out.println("The average of an Array is: " + average(numArray));
    }
    public  static long sum(int [] numArray )
    {
        int i=0;
        int sum=0;
        while (i<numArray.length)
        {
            sum = sum+ numArray[i];
            i++;
        }
        return sum;
    }
    public static double average(int [] numArray)
    {
        return (double)sum(numArray) / numArray.length;
    }

}

