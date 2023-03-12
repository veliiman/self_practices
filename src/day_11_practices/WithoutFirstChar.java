package day_11_practices;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        System.out.println("enter two words");

        String word1 = new Scanner(System.in).nextLine();
        String word2 = new Scanner(System.in).nextLine();

        word1 = word1.substring(1);
        word2 = word2.substring(1);

        System.out.println(word1+word2);



    }
}
/*
Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */