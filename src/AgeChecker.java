/* Zapytaj uzytkownika o wiek.
W przypadku gdy ma mniej niż 18 lat wypisz na ekranie informacje ze nie moze kupić alkoholu.
Gdy ma więcej niż 18 lat podziękuj za zakupy
 */

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj swój wiek");
        int age = scanner.nextInt();

        if(age < 18 ) {
            System.out.println("Nie można kupić alkoholu poniżej 18 lat");
        } else {
            System.out.println("Dziękujemy za zakupy");
    }

}}
