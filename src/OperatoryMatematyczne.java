import org.w3c.dom.ls.LSOutput;

// umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {
    public static void main(String[]args){
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber; //10
        int subtraction = firstNumber - secondNumber; //-2
        int multiplication = firstNumber * secondNumber; //24
        float division = thirdNumber/secondNumber; //0,66
        int mod = secondNumber%firstNumber; //ile 4 mieści się w 6 = 1, reszta z dzielenie czyli modulo to 2

       /* System.out.println("Wynik dodawania " + addition); //+
        System.out.println("Wynik odejmowania " + subtraction); // +
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Wynik mnozenia " + multiplication); // +
        System.out.println("Wynik modulo " + mod); // + */

        firstNumber+=secondNumber; // to znaczy że nadpisujemy tę zmienną i to += tzn ze firstNumber bedzie sie równała dodaniu firstNumber i socondNumber
        System.out.println("Po dodaniu " + firstNumber); //10
        firstNumber-=secondNumber; // firstNumber = firstNumber - secondNumber
        System.out.println("Po odejmowaniu " + firstNumber); //4
        firstNumber*=secondNumber; //firstNumber * secondNumber
        System.out.println("Po mnożeniu " + firstNumber); //24
        firstNumber/=secondNumber; // firstNumber / secondNumber
        System.out.println("Po dzieleniu" + firstNumber); //4
        firstNumber%=secondNumber; //firstNumber % secondNumber
        System.out.println("Po modulo" + firstNumber); //4
    }
}