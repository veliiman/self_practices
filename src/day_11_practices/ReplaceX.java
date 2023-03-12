package day_11_practices;

public class ReplaceX {
    public static void main(String[] args) {

        String word = "xcodeX";
        word = word.toLowerCase();

        word = word.replace("x", "a");

        System.out.println(word);


    }
}
/*
Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */