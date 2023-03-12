package day_13_practices;

import java.util.Scanner;

public class combine {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);

        System.out.println("Enter two words");

        String word1 = word.next().toLowerCase();
        String word2 = word.next().toLowerCase();

        if (word1 == word2){
            System.out.println(word2);
        }else {
            System.out.println(word1 + word2);
        }




    }
}
/*
Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
 */