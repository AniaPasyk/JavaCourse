//przechowują aktualną wartość i umożliwiają wykonanie akcji (wywołanie metod) na tych danych

public class TypyObiektowe {
    //liczby stałoprzecinkowe
    Byte firstNumber = 127; //1 bajt -128 do 127
    Short secondNumber = 32689; // 2 bajty -32768 do 32767
    Integer thirdNumber = 32768999; // 4 bajty - 2 147 483 648 do 2 147 483 647
    Long fourthNumber = 214800L; // 8 bajtów -2^63 do (2^63)-1

    //liczby zmiennoprzecinkowe
    Float fifthNumber = 4.99934F; // 4 bajty - maksymalnie 6-7 liczb bo przecinku
    Double sixthNumber = 3.9999999999999; //8 bajtów - maksymalnie ok 15 cyfr po przecinku

    //wartość logiczna
    Boolean prawda = true;
    Boolean falsz = false;

    //pojedynczy znak
    Character letter = 'A';

    //ciagi znakow
    String hello = "Hello Ania";


}


