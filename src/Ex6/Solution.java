package Ex6;

public class Solution {
    public static void main(String[] args) {
        System.out.println(countConcurrency("chessmasters", 's'));
        System.out.println(countConcurrencyBetter("chessmasters", 's'));

//        String exe = "chessmaster";
//        System.out.println(exe.replace("s", ""));

    }
    public static int countConcurrency(String str, char c){
        int concurrency = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                concurrency++;
            }
        }
        return concurrency;
    }
    public static int countConcurrencyBetter(String str, char c){
        return str.length() - str.replace(String.valueOf(c),"").length();
    }

    public static long countConcurrencyFunctional(String str, char ch){
        return str.chars().filter(c -> c == ch).count();
    }
}
