package LinearSearch;

import java.util.stream.Stream;

         /* O(n)*/

public class Solution {
    public static void main(String[] args) {
        int[]array = {0,2,3,4,5,7,9};
        System.out.println(isFound(array, 7));
        System.out.println("--------------");
        String[] arrStr = {"king", "queen", "chess"};
        System.out.println(containsChar(arrStr,"chess"));
    }
    public static boolean isFound(int[] intArray, int x){
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] == x)
                return true;
        }
        return false;
    }
    //Functional style
    public static boolean containsChar(String[] strArray, String x){
        Stream<String> stream = Stream.of(strArray);
        return stream.anyMatch(e -> e.equals(x));
    }
}
