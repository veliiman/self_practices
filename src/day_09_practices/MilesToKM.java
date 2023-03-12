package day_09_practices;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles:");
        double miles = input.nextDouble();

        double km = (miles * 1.6);

        System.out.println(miles + " miles equal to " + km + "kilometers");

        input.close();

    }
}
