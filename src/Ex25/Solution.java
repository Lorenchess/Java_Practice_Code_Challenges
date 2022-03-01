package Ex25;

public class Solution {
    public static void main(String[] args) {
        MinAndMax(5, 10);
    }
    public static void MinAndMax(int num1, int num2){
        int minVAlue = Math.min(num1, num2);
        int maxValue = Math.max(num1,num2);
        System.out.println(Integer.min(num1,num2));
        System.out.println(Integer.max(num1,num2));
    }
}
