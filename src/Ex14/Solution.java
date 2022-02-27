package Ex14;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(charMostAppearances("chessss"));
        System.out.println(charMostAppearances("memmec"));
    }
    public static char charMostAppearances(String str){
        Map<Character, Integer> mapStr = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            mapStr.compute(str.charAt(i), (K, V) -> V == null ? 1 : ++V);
        }
        int maxFrequency = 0;
        char ch = ' ';
        for (Map.Entry<Character, Integer> entry : mapStr.entrySet()){
            if (entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
                ch = entry.getKey();
            }
        }
        return ch;
    }
}
