package day_06_practices;

public class NumberToWord {
    public static void main(String[] args) {

        int n = 5;

        boolean Zero = n == 0;
        boolean One = n == 1;
        boolean Two = n == 2;
        boolean Three = n == 3;
        boolean Four = n == 4;
        boolean Five = n == 5;
        boolean Six = n == 6;
        boolean Seven = n == 7;
        boolean Eight = n == 8;
        boolean Nine = n == 9;

        String result = " ";

        if (Zero) {
            result = "Zero";
        }
        if (One) {
            result = "One";
        }
        if (Two) {
            result = "Two";
        }
        if (Three) {
            result = "Three";
        }
        if (Four) {
            result = "Four";
        }
        if (Five) {
            result = "Five";
        }
        if (Six) {
            result = "Six";
        }
        if (Seven) {
            result = "Seven";
        }
        if (Eight) {
            result = "Eight";
        }
        if (Nine) {
            result = "Nine";
        }
        System.out.println(result);




    }
}
/*
int n = 12;

        boolean has28Days = n == 2;
        boolean has30Days = n == 4 || n == 6 || n == 9 || n == 11;
        boolean has31Days = !has28Days && !has30Days;

        String result = "";

        if (has28Days){
            result = "28 days";
        }

        if (has30Days){
            result = "30 days";
        }

        if (has31Days){
            result = "31 days";
        }

        System.out.println(result);
 */