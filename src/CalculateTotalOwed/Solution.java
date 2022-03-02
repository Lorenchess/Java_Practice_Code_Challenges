package CalculateTotalOwed;

public class Solution {
    public static void main(String[] args) {
        System.out.println(calcRemainingAmount(100000, 3));
        //System.out.println(calcRecursive(100000, 3));

    }

    public static int calcRemainingAmount(int total, int months){
        int result = total;

        for (int i = 0; i < months; i++){
            result -= result / 10;
        }
      return result;
    }

//    public static int calcRecursive(int total, int months){
//        if (months == 0) return 0;
//        int result = total;
//        result -= result / 10 + calcRecursive(result, months-1);
//        return result;
//    }
}
