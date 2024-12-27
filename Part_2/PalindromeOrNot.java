public class PalindromeOrNot {
        public static void main(String[] args) {
            System.out.println("Description: ");

            int [] arr= ArrayUtility.inputArray();
            if(isPalindrome(arr))
            {
                System.out.println("Array is Palindrome");
            }
            else
            {
                System.out.println("Array is not Palindrome");
            }
        }
        public static boolean isPalindrome(int [] arr) {
            int i = 0;
            int size = arr.length - 1;
            while (i < arr.length/2)
            {
                if (arr[i] != arr[size - i])
                { return false; }
            i++;
            }
        return true;
        }

    }


