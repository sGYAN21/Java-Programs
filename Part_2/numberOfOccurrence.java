import java.util.Scanner;
public class numberOfOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array element: ");
        int [] nums= ArrayUtility.inputArray();
        System.out.println("Enter the elements to find the Occurrence in Array: ");
        int occ= input.nextInt();
        System.out.println("the "+ occ + " number is find "+ occurrence(nums , occ)+ " times" );
    }
    public static int occurrence( int [] nums , int occ )
    {
        int i=0;
        int count=0;
        while (i<nums.length)
        {
            if(occ==nums[i])
                count++;
            i++;
        }
        return count;
    }
}