package day_14_practices;

import java.util.Scanner;

public class finRa {
    public static void main(String[] args) {

        String result;
        int num = 0;

        for (int i = 1; i < 100; i++) {
            num = i;
             if (num % 3 == 0 && num % 5 ==0) {
                result = "FINRA";
            }else if (num % 5 ==0) {
                 result = "RA";
            } else if (num % 3 == 0 ) {
                 result = "FIN";
             }else{
                 result = String.valueOf(num);
             }

            System.out.print( result + " ");
        }


    }
}
/*
Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
 */