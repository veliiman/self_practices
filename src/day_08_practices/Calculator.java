package day_08_practices;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 30;
        double n2 = 10;

        char mathOperator = '*';

        switch (mathOperator){

            case '+' :
                System.out.println(n1 + n2);
                break;

            case '-' :
                System.out.println(n1 - n2);
                break;

            case '*' :
                System.out.println(n1 * n2);
                break;

            case '/' :
                System.out.println(n1 + n2);
                break;

            default:
                System.out.println("invalid operator");
        }

    }
}
