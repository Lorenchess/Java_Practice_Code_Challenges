package C5;

public class Solution {
    public static void main(String[] args) {
        countingVowelsAndConsonants("ramon");
        countingVowelsAndConsonants("lorente");

    }
    public static void countingVowelsAndConsonants(String str){
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++){
            if (!isVowel(str.charAt(i))){
                consonants++;
            } else {
                vowels++;
            }
        }
        System.out.println("vowels " + vowels);
        System.out.println("consonants " + consonants);
    }
    private static boolean isVowel(char c){
        if ("aeiou".contains(String.valueOf(c).toLowerCase()))
            return true;
        return false;
    }
}
