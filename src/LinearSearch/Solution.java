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
        System.out.println("---linear recursion----");
        System.out.println(linearSearchRecurse(array, 70, 0));
        System.out.println(linearSearchRecurse(array, 7, 0));
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

    public static int linearSearchRecurse(int[] array, int target, int i){
       if (i > array.length-1) return -1;
       if (array[i] == target) return i;
       else
           return linearSearchRecurse(array, target, i+1);
    }
}

















