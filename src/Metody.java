//To funkcja wyewnątrz klasy, to funkja wykonywana przez obiekt stworzona wg klasy w symulowanym środowisku
// blok który zawiera jakieś instrukcje
// może być uruchomiona (wywoływana) poprzez odwołanie się do jej nazwy()

public class Metody {

    public void policzWyynik(){
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0 ; i< 100; i++){
        result = result + i;}
        System.out.println("Rezultat to: " +  result);
}
    public int pobierzWynik(){
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0 ; i< 100; i++){
            result = result + i;}
        System.out.println("Rezultat to: " +  result);
        return result;
    }

    public void policzWyynikParam( int number){
        System.out.println("Number ma wartość: " + number);
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0 ; i< number; i++){
            result = result + i;}
        System.out.println("Rezultat to: " +  result);
    }

    public int add(int firstNumber, int secondNumber, String word) {
        System.out.println("Suma to: " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }
}

