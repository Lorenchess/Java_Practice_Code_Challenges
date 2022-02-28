package Ex18;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(areStringsAnagram("cat", "atc"));
        System.out.println(isAnagram("cat", "atc"));
    }
    public static boolean areStringsAnagram(String strA, String strB){
        strA = strA.toLowerCase();
        strB = strB.toLowerCase();

        char[]strArrayA = strA.toCharArray();
        char[]strArrayB = strB.toCharArray();

        Arrays.sort(strArrayA);
        StringBuilder sbA = new StringBuilder(String.valueOf(strArrayA));
        Arrays.sort(strArrayB);
        StringBuilder sbB = new StringBuilder(String.valueOf(strArrayB));

        strA = sbA.toString();
        strB = sbB.toString();

        if (!strA.equals(strB))
            return false;
        return true;
    }

    public static boolean isAnagram(String str1, String str2){
        char[]chStr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[]chStr2 = str2.replaceAll("\\s","").toLowerCase().toCharArray();

        if (chStr1.length != chStr2.length)
            return false;
        Arrays.sort(chStr1);
        Arrays.sort(chStr2);
        str1 = String.valueOf(chStr1);
        str2 = String.valueOf(chStr2);
        if (!str1.equals(str2))
            return false;
        return true;
    }
}
