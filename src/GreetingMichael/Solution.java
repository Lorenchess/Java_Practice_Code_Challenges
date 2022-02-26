package GreetingMichael;

import java.util.Scanner;

public class Solution {

        public static Scanner sc = new Scanner(System.in);
        public static int counter = 3;
        public static void main(String[] args) {
            String name = "", myName = "Michael";
            while(counter > 0){
                System.out.println("What's your name?");
                name = sc.nextLine();
                if (myName.equals(name)) break;
                counter--;
            }

            System.out.println(greeting(name, myName));
        }
        public static String greeting(String name, String myName){
            String nameLower = name.toLowerCase();
            String myNameLower = myName.toLowerCase();
            if (nameLower.equals(myNameLower)) return "Hi " + myName + " it's good to see you!";
            else
                return "I am sorry I don't know you..." ;
        }
}

