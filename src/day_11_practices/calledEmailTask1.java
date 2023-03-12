package day_11_practices;

import java.util.Scanner;

public class calledEmailTask1 {
    public static void main(String[] args) {
        System.out.println("enter your email address");

        String email = new Scanner(System.in).nextLine();

        String services = email.substring(email.indexOf('@'));

        String firstName = email.substring(0, email.indexOf('_'));
        String lastName = email.substring(email.indexOf('_')+1, email.indexOf('@'));

        boolean hasUnderscore = email.contains("_");

        if (hasUnderscore == true){
            System.out.println(lastName + "_" + firstName + services);
        }else {
            System.out.println(email);
        }





    }
}
/*
Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com

            boolean hasJava = sentence.toLowerCase().contains("java");

            int beginning = email.indexOf('@') +1;

        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);

 */