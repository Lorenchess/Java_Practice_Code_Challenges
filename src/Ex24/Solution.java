package Ex24;

import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(transformString("Gol!"));
        System.out.println(transformFunction("Gol!"));
    }
    public static String transformString(String str){
        String result = Stream.of(str)
                .map(String::toUpperCase)
                .map(s -> s.repeat(2))
                .map(s -> s.replaceAll("O", "OOOOOOOO"))
                .findFirst().get();
        return result;
    }

    public static String transformFunction(String str){
        String result = str.transform(String::toUpperCase)
                .transform(s -> s.repeat(2))
                .transform(s -> s.replaceAll("O", "OOOOOOOO"));

        return result;
    }
}
