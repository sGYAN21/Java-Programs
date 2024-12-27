public class SumDiagonalElements {
    public static void main(String[] args) {
        System.out.println("Description ");
        int [][] numArr = ArrayUtility.input2DArray();
        System.out.println("The sum of diagonals is : " + sumOfDiagonal(numArr));
    }
    public static long sumOfDiagonal (int [][] numArr)
    {
        long leftSum = sumOfLeftDiagonal(numArr);
        long rightSum = sumOfRightDiagonal(numArr);
        long sum = leftSum+rightSum;
        if(numArr.length%2!=0)
        {
            int index =numArr.length/2;
            sum-= numArr[index][index];
        }

        return sum;
    }
    public static long sumOfLeftDiagonal (int [][] numArr)
    { long sum =0;
        int i=0;
        while(i< numArr.length) {
            sum = sum + numArr[i][i];
            i++;
        }
        return sum;
    }
    public static long sumOfRightDiagonal (int [][] numArr)
    {
        long sum=0;
        int i=0;
        while (i<numArr.length)
        {
            int col = numArr.length - 1 -i;
            sum = sum +numArr[i][col];
            i++;
        }
        return sum;
    }
}
