package day_06_practices;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 25;
        int b = 15;
        int c = 20;

        if (b < a && a < c || b > a && a > c){
            System.out.println(a + " is the median number");
        }
        if (a < b && b < c || a > b && b > c){
            System.out.println(b + " is the median number");
        }
        if (a < c && c < b || a > c && c > b){
            System.out.println(c + " is the median number");
        }

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