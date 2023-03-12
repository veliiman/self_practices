package day_12_practices;

import java.util.Scanner;

public class emailDomain {
    public static void main(String[] args) {

        System.out.println("enter your email address");

        String email = new Scanner(System.in).nextLine();

        String domain = email.substring(email.indexOf("@"));
        System.out.println("domain: " + domain);

    }

}
/*
Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */