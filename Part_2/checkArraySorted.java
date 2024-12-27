public class checkArraySorted {
    public static void main(String[] args) {
        int [] numArr= ArrayUtility.inputArray();
        System.out.println("Description: ");
        if((isIncreasing(numArr))|| (isDecreasing(numArr)))
            System.out.println("The array is sorted");
        else
            System.out.println("the array is unsorted");
    }
    public static boolean isIncreasing (int [] numArr)
    {
        int i=1;
        while (i<numArr.length)
        {
            if(numArr[i]<numArr[i-1])
                return false;
            i++;
        }
        return true;
    }
    public static boolean isDecreasing (int [] numArr)
    {
        int i=1;
        while (i<numArr.length)
        {
            if(numArr[i]>numArr[i-1])
                return false;
            i++;
        }
        return true;
    }
}
