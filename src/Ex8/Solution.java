package Ex8;

public class Solution {
    public static void main(String[] args) {
        String str = "     This   is an   example of white space  remove     ";
        //System.out.println(str.replaceAll("\\s", "")); //remove all the white spaces
        System.out.println(str.replaceAll(" +", " ")); //remove unnecessary white spaces but keep the ones in between


    }
}
