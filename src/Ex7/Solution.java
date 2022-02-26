package Ex7;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertToInt("5"));
        System.out.println(convertToDouble("5"));
        System.out.println(convertToFloat("5"));
        System.out.println(convertToLong("5"));
    }
    public static int convertToInt(String str){
        int integer =  Integer.parseInt(str);
        return integer;

    }
    public static double convertToDouble(String str){
       return Double.parseDouble(str);
    }
    public static float convertToFloat(String str){
      return Float.parseFloat(str);
    }
    public static long convertToLong(String str){
      return Long.parseLong(str);
    }
}
