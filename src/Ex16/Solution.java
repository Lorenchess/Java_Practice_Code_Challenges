package Ex16;

public class Solution {
    public static void main(String[] args) {
        System.out.println(containsSubstringBetter("hello world", "orl"));
        System.out.println(containsSubstringBetter("hello world", "abc"));
    }

    public static boolean containsSubstringBetter(String str, String sub){
        return str.contains(sub);
    }
}
