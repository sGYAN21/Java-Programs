import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Description");
        int [][] numArr = ArrayUtility.input2DArray();
        System.out.println("Enter the number to Search :");
        int num = input.nextInt();
        if(isSearch(numArr, num))
            System.out.println("The number is Found ");
        else
            System.out.println("The number is not Found ");

    }
    public static boolean isSearch(int [][] numArr, int num)
    {
        int i=0;
        while(i< numArr.length)
        {
            int j=0;
            while (j<numArr.length)
            {
                if(numArr[i][j]== num)
                    return true;
                j++;
            }
            i++;
        }
        return false;
    }
}
