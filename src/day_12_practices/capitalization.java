package day_12_practices;

import java.util.Scanner;
import java.util.SortedMap;

public class capitalization {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your first name");

        String firstName = input.next().toLowerCase();

        System.out.println("enter your last name");

        String lastName = input.next().toLowerCase();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        System.out.println(firstName + " " + lastName);

    }
}
/*
Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */