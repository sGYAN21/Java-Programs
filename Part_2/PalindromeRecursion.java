import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Word to find Palindrome : ");
        String name = input.nextLine();
        System.out.println("Your String : "+((isPalindrome(name)?"Palindrome"
                                                                              :  "Not Palindrome")));
    }
    public static boolean isPalindrome(String name)
    {
            int last = name.length()-1;
            if(name.length()<=1)
                return true;
            else if((name.charAt(0)!= name.charAt(last)))
                    return  false;
            String newStr = name.substring(1,last);
                return (isPalindrome(newStr));
    }

}
