import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        sc.close();
        int n = str.length();
        boolean isPalindrome = ispalindrome(str, 0, n-1);

        if (isPalindrome) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
        
    }

    static boolean ispalindrome(String str, int start, int end){
        if (start >= end) {
            return true;
        }
        return (str.charAt(start) == str.charAt(end)) && ispalindrome(str, start+1, end-1);
    }
}