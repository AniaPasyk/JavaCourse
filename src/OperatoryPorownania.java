// porównują elementy równania i zwracają logiczną wartość (true/false)

import java.util.Scanner;

public class OperatoryPorownania {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę 'a' "); //4
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę 'b' "); //6
        int secondNumber = scanner.nextInt();

        System.out.println("a > b : " + (firstNumber > secondNumber)); //false
        System.out.println("a < b : " + (firstNumber < secondNumber)); //true
        System.out.println("a >= b : " + (firstNumber >= secondNumber)); //false
        System.out.println("a <= b : " + (firstNumber <= secondNumber)); //true
        System.out.println("a == b : " + (firstNumber == secondNumber)); //false
        System.out.println("a != b : " + (firstNumber != secondNumber)); // true
    }
}

