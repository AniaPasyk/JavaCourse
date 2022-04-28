package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {

    // pobierz wiek od użytkownika, jeżeli będzie mniejszy od zera to wyrzyć wyjątek InvalidAgeException
    // jeżeli mamy 18>= to mozemy wypisa ze jestes pełnoletni

    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj swój wiek");
        int age = scanner.nextInt();

       if(age < 0){
           throw new InvalidAgeException("Your age is not valid");
       }
       if (age>=18) {
            System.out.println("You're an adult");
        }
       else {
           System.out.println("You're not an adult ");
       }


    }
}
