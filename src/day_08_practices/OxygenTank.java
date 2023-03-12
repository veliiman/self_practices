package day_08_practices;

public class OxygenTank {
    public static void main(String[] args) {

        int level = 110;

        String result = (level >= 0 && level <= 100)?(level >= 90 && level <= 100)? "Your tank is full":(level >= 80 && level < 90)? "Still okay":(level >= 70 && level < 80)? "Don't go too far":(level >= 60 && level < 70)? "Start to head back": "Be careful now you at at 50%"
         :"invalid level";

        System.out.println(result);




    }
}
