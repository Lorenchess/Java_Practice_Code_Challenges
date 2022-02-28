package Ex17;


import java.util.regex.Pattern;


public class Solution {
    public static void main(String[] args) {

        System.out.println(countOccurrenceOfSubstring("hellollollo", "ll"));
    }
    public static int countOccurrenceOfSubstring(String str, String sub){
        int result = str.split(Pattern.quote(sub), -1).length-1;

        return result < 0 ? 0 : result;
    }
}
