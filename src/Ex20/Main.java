package Ex20;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeSpaces("    hel l  o  "));
        System.out.println(removeSpaces("    hello  "));
    }
    public static String removeSpaces(String str){
        return str.replaceAll("\\s",""); //removes all spaces!
          //return str.strip(); // solve the problems for leading and end/trailing spaces but no for inner spaces.
    }
}
