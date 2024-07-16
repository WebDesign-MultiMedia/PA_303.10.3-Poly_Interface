import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        KidUser some = new KidUser("Fiction", 10);

        KidUser adult = new KidUser("Kids", 20);

        System.out.println(" Hi Kids, This is the Kids section. \n");
        System.out.println("Hello my name is John.\n I am " + some.age + " years old. I just registered an account.");
        some.registerAccount();

        System.out.println("\nHello my name Mike. \n I am " + adult.age + " years old. I just registered an account.");
        adult.registerAccount();
        System.out.println("\nBorrowing books section: \n" );
        System.out.println("John wants a "+ some.bookType + " book");
        some.requestBook();
        System.out.println("\nJohn took a " + adult.bookType + " books");
        adult.requestBook();
        System.out.println("-------------------+---------------------");

        AdultUser age = new AdultUser("Kids", 5);
        AdultUser age2 = new AdultUser("Fiction", 23);

        System.out.println(" Hello Adults, This is a the Adult section: \n");
        System.out.println("Hello my name Roger. I am " + age.age + " years old. \n I just registered an account.");
        System.out.println("Loading....");
        age.registerAccount();
        System.out.println(" \nHello my name is Micheal. I am " + age2.age + " years old. \n I just registered an account.");
        System.out.println("Loading.... ");
        age2.registerAccount();
        System.out.println(" ");
        System.out.println("Micheal wants a " + age.bookType + " book?");
        age.requestBook();
        System.out.println("\n Micheal took " + age2.bookType + " book instead.");
        age2.requestBook();

    }
}