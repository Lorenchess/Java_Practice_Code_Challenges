package Ex19;

public class Solution {
    public static void main(String[] args) {
        System.out.println(insideBrackets("xyz[abc]123"));
        System.out.println(insideBrackets("x[hello]"));
        System.out.println(insideBrackets("[xy]1"));
    }
    /**
     *

     Given a string that contains a single pair of brackets, compute recursively a new string made of
     only of the brackets and their contents, so "xyz[abc]123" yields "[abc]".

     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     insideBrackets("xyz[abc]123") <b>---></b> [abc]<br>
     insideBrackets("x[hello]") <b>---></b> [hello] <br>
     insideBrackets("[xy]1") <b>---></b> [xy] <br>
     */

    public static String insideBrackets(String str) {
            if (str.length() <= 0) return str;
            char starBracket = '[', endBracket = ']';
            int indexOfLastBracket = str.indexOf(endBracket);

            if (str.charAt(0) == starBracket)
                return str.substring(0, indexOfLastBracket+1) + insideBrackets(str.substring(1));
            else
                return insideBrackets(str.substring(1));
    }
}
