import java.util.Scanner;
public class maxAndMin {
    public static void main(String[] args) {
        System.out.println("Description : ");
        int[] nums = ArrayUtility.inputArray();
        System.out.println("the Minimum of Array Element is : "+ min(nums));
        System.out.println("the Maximum of Array Element is : "+ max(nums));
    }

    public static int max(int [] nums ) {
        int i = 1;
        if(nums.length==0)
        {
            return Integer.MIN_VALUE;
        }
        int max= nums[0];
        while (i < nums.length)
        {
            if(max<=nums[i])
                max=nums[i];
            i++;
        }
        return max;
    }
    public static int min(int [] nums ) {
        int min= Integer.MAX_VALUE;
        int i = 0;

        while (i < nums.length)
        {
            if(min>=nums[i])
                min=nums[i];
            i++;
        }
        return min;
    }
}
