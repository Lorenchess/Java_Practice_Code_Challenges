package Ex32;

public class Solution {
    public static void main(String[] args) {
        System.out.println(bitwiseOperatorAndLogicalOperator(30, 40));
        System.out.println("_______________");
        System.out.println(bitwiseAndLogicalOperators(20, 25));
    }
    public static String bitwiseOperatorAndLogicalOperator(int num1, int num2){
        //if(num1 > num2 && num2 < 50)
        if (Boolean.logicalAnd(num1 > num2,num2 < 50))
            return "Yes";
        if (Boolean.logicalOr(num1 > num2, num2 == 50))
            return "Yes";

        //if(num1 < num2 ^ num2 > 100)
        if (Boolean.logicalXor(num1 < num2, num2 > 100))
            return "Yes both are false...XOR bitwise operator";

        return "No";
    }
    //combination of operators...
    public static String bitwiseAndLogicalOperators(int num1, int num2){
        if (Boolean.logicalAnd(
            Boolean.logicalOr(num1 > 10, num1 < num2), Boolean.logicalXor(num1 > 10, num1 > num2)
        ))
            return "Yes both operands are true";
        return "No";
    }
}
