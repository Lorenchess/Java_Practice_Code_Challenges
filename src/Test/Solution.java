package Test;

public class Solution {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        a = 10;
        b = 15;
        a = a + b;
        b = a - b;
        System.out.println(a);
        System.out.println(b);
        String str = new String("Hello");
        StringBuilder str1 = new StringBuilder("hello");
        String st = "hello";
        String stcopy = "hello";
        System.out.println(st.equals(str));
        System.out.println(st == str);
        System.out.println(st.equals(stcopy));
        System.out.println(st == stcopy);
    }
}
