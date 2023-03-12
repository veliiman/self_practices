package day_11_practices;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {

        System.out.println("enter two words");

        String word1 = new Scanner(System.in).nextLine();
        String word2 = new Scanner(System.in).nextLine();


        String word3 = word2.substring(1);

        boolean b = word2.charAt(0) == word1.charAt(word1.length() - 1);

        if (b){
            System.out.println( word1 + word3 );
        }else{
            System.out.println(word1 + word2);
        }


    }
}
/*
Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight

 */