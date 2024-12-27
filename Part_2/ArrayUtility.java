import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of array \n");
        int size= input.nextInt();
        int [] nums = new int[size];
        int i=0;
        while (i< nums.length)
        {
            System.out.print("enter the element no " +(i+1)+ ": ");
            nums[i]= input.nextInt();
            i++;
        }
        return nums;

    }
    public static void displayArray(int [] numArray)
    {
        int i=0;
        while (i<numArray.length)
        {
            System.out.print(numArray[i]+"\t");
            i++;
        }
        System.out.println();

    }
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row of array \n");
        int row= input.nextInt();
        System.out.print("Enter the column of array \n");
        int column = input.nextInt();
        int [][] numArray = new int[row][column];
        int i=0;
        while (i< row) {
            int j = 0;
            while (j < column) {
                System.out.print("enter the element no " + (i + 1) +  " "+ (j+1)+"th");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }

}
