package Recursion16;

public class Solution {
    public static void main(String[] args) {
        System.out.println(yoYo("xyoxyo"));
    }

    /**
     *
     Given a string, compute recursively (no loops) the number of times
     lowercase "yo" appears in the string.
     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     yoYo("xhyoxx") <b>---></b> 1<br>
     yoYo("nyonnyon")<b>---></b> 2 <br>
     yoYo("yo")  <b>---></b> 1 <br>
     */

//    public static int yoYo(String str) {
//        int counter= 0;
//        String target = "yo";
//        int len = str.length();
//        if (len < 2) return 0;
//        if (str.substring(0, 2).equals(target))
//            //return 1 + yoYo(str.substring(1));
//            return ++counter + yoYo(str.substring(1));
//        else
//            return yoYo(str.substring(1));
//    }

    public static int yoYo(String str) {
        String target = "yo";
        int counter = 0;
        if (str.length() < 2) return 0;

        if (str.substring(0, 2).equals(target))
            return ++counter + yoYo(str.substring(1));
        else
            return yoYo(str.substring(1));
    }
}




















