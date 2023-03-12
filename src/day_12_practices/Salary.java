package day_12_practices;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weekly hours");
        int weeklyHours = input.nextInt();

        System.out.println("Enter your hourly rate");
        double hourlyRate = input.nextDouble();

        double income = hourlyRate * weeklyHours * 52;

        System.out.println("You make $" + hourlyRate + "per hour");
        System.out.println("You work " + weeklyHours + " hours in a week");
        System.out.println("Your gross income is $" + income);



    }


}
/*
Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
 */