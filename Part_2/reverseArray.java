public class reverseArray {
    public static void main(String[] args) {
        System.out.println("Description: ");

        int [] arr= ArrayUtility.inputArray();
        reverse(arr);
    }
    public static void reverse(int [] arr) {
        int i = 0;
        int size= arr.length-1;
        while (i <= size/2)
        {
            int temp= arr[i];
            arr[i]= arr[size-i];
            arr[size-i]= temp;
            i++;
        }
        ArrayUtility.displayArray(arr);
    }
}
