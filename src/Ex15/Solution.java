package Ex15;


import java.util.Arrays;
import java.util.Comparator;


public class Solution {
    public static void main(String[] args) {
        String[]array = new String[]{"chess","lorente","java", "javascript"};

        System.out.println(sortingByLength(array));

    }
    public static String sortingByLength(String[] array){
       Arrays.sort(array, Comparator.comparingInt(String::length));
       return Arrays.toString(array);
    }
}
