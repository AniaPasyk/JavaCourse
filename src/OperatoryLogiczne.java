// działają na

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = 2>1;
        boolean secondValue = 2<1;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && i koniunkcja -> true wtedy gdy wyrażenia składowe są równe true
        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && fourthValue); //true

        // || alternatywa -> true gdy jedno wyrażenie składowe jest równe true
        System.out.println(firstValue || secondValue); // true
        System.out.println(thirdValue || secondValue); //false

        // ! negacja -> zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!firstValue); // false
        System.out.println(!thirdValue); // true
        System.out.println(!(firstValue && secondValue)); //true
    }
}
