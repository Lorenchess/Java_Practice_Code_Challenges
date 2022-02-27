package Ex13;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(removeGivenCharacter("lorente", 'n'));
        System.out.println(removeGivenCharacterBetter("lonrenten", 'n'));
    }
    public static String removeGivenCharacter(String str, char c){
        Collection<Character> strList = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            strList.add(str.charAt(i));
        }

        if (strList.contains(c)){
            strList.remove(c);
        }

        else
            return "The element " + c + " is not in the string... " + str;

        for (var ch : strList){
            result.append(ch);
        }

        return result.toString();
    }

    public static String removeGivenCharacterBetter(String str, char c){
        return str.replaceAll(String.valueOf(c), "");
    }
}
