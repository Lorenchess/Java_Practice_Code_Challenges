package Ex11;

import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madddddam"));
        System.out.println(isPalindrome("madama"));
        System.out.println("-------------------");
        System.out.println(isPalindromeBetter("madddddam"));
    }
    public static boolean isPalindrome(String str) {
        String reversedStr = "";
        for ( int i = str.length() - 1; i >= 0; i--){
            reversedStr+= str.charAt(i);
        }
        if (reversedStr.equals(str)){
            System.out.println("Palindrome");
            return true;
        }
        else {
            System.out.println("No Palindrome");
            return false;
        }

    }

    public static boolean isPalindromeBetter(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }

}
