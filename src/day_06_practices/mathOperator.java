package day_06_practices;

public class mathOperator {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        char operator = 'p';


        if (operator == '+'){
            System.out.println(n1 + n2);
        }
        if (operator == '-'){
            System.out.println(n1 - n2);
        }
        if (operator == '*'){
            System.out.println(n1 * n2);
        }
        if (operator == '/'){
            System.out.println(n2 / n1);
        }
        if (operator != '+' && operator != '-' && operator !='*' && operator !='/'){
            System.out.println("invalid operator");
        }

    }
}
