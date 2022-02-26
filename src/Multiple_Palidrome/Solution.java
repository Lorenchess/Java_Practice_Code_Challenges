package Multiple_Palidrome;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(largestPalindrome("This is an example madam, civic, reviver"));
    }
    public static String largestPalindrome(String text){
        String result = "";
        List<String> palindromeList = new ArrayList<>();
        List<String> textList = List.of(text.split("\\W+"));

        for (int i = 0; i < textList.size(); i++) {
            if (isPalindrome(textList.get(i))){
                palindromeList.add(textList.get(i));
            }
        }
        for (int i = 0; i < palindromeList.size(); i++){
            if (largestCharacters(palindromeList) > 0)
                result = palindromeList.get(i);
        }
        return result;
    }
    private static boolean isPalindrome(String str){
        String reversedStr = new StringBuilder(str).reverse().toString();
        for (int i = 0; i < str.length(); i++){
            char chA = str.charAt(i);
            char chB = reversedStr.charAt(i);
            if (chA != chB) {
                return false;
            }
        }
        return true;
    }
    private static int largestCharacters(List<String> words){
        int maxCount = 0;
        for (int i = 0; i < words.size(); i++){
            int count = 0;
            count = words.get(i).length();
            if (count > maxCount)
                maxCount = count;
        }
        return maxCount;
    }
}
