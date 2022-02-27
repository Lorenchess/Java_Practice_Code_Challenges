package Ex13;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(removeGivenCharacter("lorente", 'n'));
        System.out.println(removeGivenCharacterBetter("lonrenten", 'n'));
        System.out.println(removeChUsingStringBuilder("chess", 'h'));

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
        return str.replaceAll(Pattern.quote(String.valueOf(c)), "");
    }

    public static String removeChUsingStringBuilder(String str, char c){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
           char ch = str.charAt(i);
          if (ch != c)
              sb.append(ch);
        }
        return sb.toString();
    }
    ///Functional style
    public static String removeCharFunctionalStyle(String str, char ch){
        return str.chars()
                .filter(c -> (c != ch))
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining());

    }
}





















