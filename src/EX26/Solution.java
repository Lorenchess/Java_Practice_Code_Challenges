package EX26;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumLargeInt(2147483647));
        System.out.println(addExact(2147483647));

        System.out.println(sumMethod(1000, 500));
    }
    public static int sumLargeInt(int num1){
        try{
           int result = num1 + num1;
           return result;
        }catch(ArithmeticException ex){
            System.out.println(ex);
        }
        return -1;
    }

    public static int sumMethod(int num1, int num2){
        int total = Integer.sum(num1, num2);
        return total;
    }

    public static int addExact(int num1){
        try {
            int result = Math.addExact(num1, num1);
            return result;
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }
}
