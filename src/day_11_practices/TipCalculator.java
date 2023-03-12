package day_11_practices;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String split = input.nextLine().toLowerCase();

        System.out.println("Enter the number of people");
        int People = input.nextInt();

        System.out.println("Enter the check amount");
        double amount = input.nextDouble();

        System.out.println("Service Quality");
        String quality = input.next().toLowerCase();

        double tip = (quality.equals("excellent")) ? 0.25 : (quality.equals("great")) ? 0.2
                : (quality.equals("good")) ? 0.15 : (quality.equals("fair")) ? 0.1 : 0.05;


        double totalTip = amount * tip;
        double totalPay = amount + totalTip;
        double totalPerPerson = totalPay/People;
        double tipPerPerson = totalTip/People;


        switch (split){
            case "yes":
            System.out.println("Number of people entered: " + People);
            System.out.println("Total to pay: " + totalPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: " + tipPerPerson);
            break;

            case "no":
                System.out.println("Number of people entered: " + People);
                System.out.println("Total to pay: " + totalPay);
                System.out.println("Total tip: " + totalTip);
                break;

        }


        input.close();

    }
}
/*
Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75

                int poor = amount * 5 / 100;
        int fair = amount * 10 / 100;
        int good = amount * 15 / 100;
        int great = amount * 20 / 100;
        int excellent = amount * 25 / 100;
 */