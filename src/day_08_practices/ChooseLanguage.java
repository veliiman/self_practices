package day_08_practices;

public class ChooseLanguage {
    public static void main(String[] args) {

        int number = 3;

        String result = "";

        switch (number) {

            case 1:
                System.out.println("Hello, thank for your call");
                break;

            case 2:
                System.out.println("Hola, gracias para llamar");
                break;

            case 3:
                System.out.println("Merhaba, aradiginiz icin tesekkurler");
                break;

            case 4:
                System.out.println("Privet, spasibo za vash zvonok");
                break;

            case 5:
                System.out.println("Merci ,pour votre appel");
                break;

            default:
                System.out.println("Invalid Number");

        }

    }
}
