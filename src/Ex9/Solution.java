package Ex9;

public class Solution {
    public static void main(String[] args) {
        String greeting = "Hello", name="Mike";
        System.out.println(joinString(greeting, name));
    }
    public static String joinString(String strA, String strB){
           return String.join(", ", strA, strB);
    }
}
