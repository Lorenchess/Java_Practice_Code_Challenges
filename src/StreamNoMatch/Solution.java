package StreamNoMatch;

import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(noMatch());
    }
    public static boolean noMatch(){
        Stream<String> languages = Stream.of("Java", "JavaScript","C#", "C++", "Python");
        boolean match = languages.noneMatch(e -> (e.length() == 7));
        return match; //true

        /**
         * the function returns true if either no elements of the stream match the provided predicate
         * or the stream is empty, otherwise false.
         * */
    }
}
