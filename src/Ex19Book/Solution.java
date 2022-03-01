package Ex19Book;

public class Solution {
    public static void main(String[] args) {
        System.out.println(concatNStings("chess", 4));
        System.out.println(concatRepeat("chess", 4));
    }
    public static String concatNStings(String str, int nTimes){
        String result = "";
        if (nTimes == 0) return result;
        StringBuilder sb = new StringBuilder(str);
        sb.append(str);
        result = sb.toString();
        return result + concatNStings(str, nTimes - 2);
    }

    public static String concatRepeat(String str, int nTimes){
        return str.repeat(nTimes);
    }
}
