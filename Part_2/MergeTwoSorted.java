public class MergeTwoSorted {
    public static void main(String[] args) {
        System.out.println("Description");
        int[] firstArr = ArrayUtility.inputArray();
        int[] SecondArr = ArrayUtility.inputArray();
        int[] mergedArr = merge(firstArr, SecondArr);
        ArrayUtility.displayArray(mergedArr);
    }

    public static int[] merge(int[] firstArr, int[] SecondArr) {
        int newSize = firstArr.length + SecondArr.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;
        while (i < firstArr.length || j < SecondArr.length) {
            if (j== SecondArr.length ||
                    (i< firstArr.length&&firstArr[i] < SecondArr[j])) {
                newArr[k] = firstArr[i];
                i++;
                k++;
            }
            else {
                newArr[k]= SecondArr[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}

