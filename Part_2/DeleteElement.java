import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numArray = ArrayUtility.inputArray();
        System.out.println("Description");
        System.out.println("Enter the Number to Delete:");
        int number = input.nextInt();
        ArrayUtility.displayArray(DeleteNum(numArray,number));
    }
    public static int [] DeleteNum(int [] numArray, int num)
    {
     int occ= numberOfOccurrence.occurrence(numArray, num);
     if(occ==0)
     {
         return numArray;
     }
     int newSize = numArray.length-occ;
     int [] newArr = new int[newSize];
     int i=0,j=0;
     while(i<numArray.length)
     {
         if(numArray[i]!=num)
         {    newArr[j]=numArray[i];
         j++;
         }
     i++;
     }
         return newArr;
    }
}
