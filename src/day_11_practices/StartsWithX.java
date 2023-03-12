package day_11_practices;

public class StartsWithX {
    public static void main(String[] args) {

        String word = "xcodex";

        word = word.replaceFirst("x", "a");

        System.out.println(word);



    }
}
/*
Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */