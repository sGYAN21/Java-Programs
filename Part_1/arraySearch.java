import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 6, 8, 7, 87, 65, 4, 68, 23, 9, 98, 34};
        System.out.println("enter the number you want to search");
        int num = input.nextInt();
        boolean isFound= isFound(arr, num);
        if (isFound) {
            System.out.println("number found");
        } else {
            System.out.println("number not found");
        }
        String[] strArr= new String[2];
        strArr[0]="My String";
        strArr[1]="String";
        String[] newStrArr= {"first","Second","Third"};
        System.out.println(newStrArr.length);

    }
      public static boolean isFound(int[] arr, int num)
        {
            int i=0;
            while (i< arr.length)
            {
                if(arr[i]==num)
                {
                return true;
                }
                i++;
            }
            return false;
        }

}
