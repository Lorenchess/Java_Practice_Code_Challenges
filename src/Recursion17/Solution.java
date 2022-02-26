package Recursion17;

public class Solution {
    public static void main(String[] args) {
        System.out.println(endoo("oore"));
    }
    /**
     *
     Given a string, compute recursively a new string where all the
     lowercase 'o' chars have been moved to the end of the string.

     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     endoo("oore") <b>---></b> reoo<br>
     endoo("oohoi") <b>---></b> hiooo <br>
     endoo("oanotgo") <b>---></b> antgooo <br>
     */

//    public static String endoo(String str) {
//      //if (str.length() <= 0) return "";
//        if (str.equals("")) return str;
//
//       if (str.charAt(0) == 'o')
//           return endoo(str.substring(1)) + 'o';
//       else
//           return str.charAt(0) + endoo(str.substring(1));
//    }

    public static String endoo(String str) {
        if (str.equals("")) return str;
        if (str.charAt(0) == 'o')
            return endoo(str.substring(1)) + 'o';
        else
            return str.charAt(0) + endoo(str.substring(1));
    }
}






















