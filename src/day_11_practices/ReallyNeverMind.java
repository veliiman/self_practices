package day_11_practices;

import java.util.Scanner;

public class ReallyNeverMind {
    public static void main(String[] args) {


        System.out.println("enter a word");

        String word = new Scanner(System.in).nextLine();

        boolean word1 = word.endsWith("ly");


        if (word1 == true){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }


    }
}
/*
Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */