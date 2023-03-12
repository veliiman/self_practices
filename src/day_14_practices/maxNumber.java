package day_14_practices;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter five numbers: ");
            int number = input.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The maximum number is: " + max);
    }
}
