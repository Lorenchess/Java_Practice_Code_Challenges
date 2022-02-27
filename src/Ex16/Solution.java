package Ex16;

public class Solution {
    public static void main(String[] args) {
        System.out.println(containsSubstring("hello world", "orl"));
        System.out.println(containsSubstring("hello world", "abc"));
        System.out.println("______________________");
        System.out.println(containsSubstringBetter("hello world", "orl"));
        System.out.println(containsSubstringBetter("hello world", "abc"));
    }
    public static boolean containsSubstring(String str, String sub){
        for (int i = 0; i < str.length(); i++){
            if (!str.contains(sub))
                return false;
        }
        return true;
    }

    public static boolean containsSubstringBetter(String str, String sub){
        return str.contains(sub);
    }
}
