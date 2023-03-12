package day_09_practices;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the current speed");
        int speed = input.nextInt();

        int speedLimit = 55;

        if(speed > speedLimit){
            System.out.println("You're driving " + (speed - speedLimit) + "mph over the limit. Slow down!");
        }else {

        }


    }
}
