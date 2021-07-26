import java.util.Scanner;

public class CalculatorTest {

    //napisz program, który poprosi użytkownika o 2 liczby, a następnie wykonania na nich podstawowych operacji matematycznych

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj prosze pierwszą liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj prosze drugą liczbe");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.addition(firstNumber, secondNumber);
        int subtraction = calculator.subtraction(firstNumber, secondNumber);
        int multiplication = calculator.multiplication(firstNumber, secondNumber);
        int division = calculator.division(firstNumber, secondNumber);
        int mod = calculator.mod(firstNumber, secondNumber);

        System.out.println("Suma pierwszej i drugiej liczby wynosi " + addition + ".");
        System.out.println("Różnica pierwszej i drugiej liczby wynosi " + subtraction + ".");
        System.out.println("Iloczyn pierwszej i drugiej liczby wynosi " + multiplication + ".");
        System.out.println("Iloraz pierwszej i drugiej liczby wynosi " + division + ".");
        System.out.println("Reszta z dzielenia pierwszej i drugiej liczby wynosi " + mod + "." );
    }


    }

