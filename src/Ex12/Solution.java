package Ex12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("chess"));
        System.out.println(removeDuplicate("rrrreeeemmmooovvee"));
        System.out.println("______");
        System.out.println(removeDuplicateBetter("hello"));
    }
    public static String removeDuplicate(String str){
        Set<Character> characters = new LinkedHashSet<>();
        for (int i = 0; i< str.length(); i++){
            characters.add(str.charAt(i));
        }
        String joined = "";
        for (var element : characters){
            joined+=element;
        }
       return joined;

    }

    public static String removeDuplicateBetter(String str){
        char[]chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (var ch : chArray){
            if (sb.indexOf(String.valueOf(ch)) == -1)
                sb.append(ch);
        }
        return sb.toString();
    }
}
