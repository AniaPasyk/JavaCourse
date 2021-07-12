public class InkrementacjaDekrementacja {

    public static void main(String[]args){
        // inkrementacja - zwiększenie wartości o jeden
        int a = 0;
        System.out.println("Wartość a to " + a); //0

        int b = a++;  //postinkrememntacja - wartość a i tak będzie większa o jeden, ale b dopiero później się zwiększy
        System.out.println("Wartość b to " + b); //0
        System.out.println("Wartość a to " + a); //1

        int c = ++a; //preinkrementacja - wartość a już zwiększamy o jeden i c też od razuz większamy
        System.out.println("Wartość c to " + c); //2
        System.out.println("Wartość a to " + a); //2

        //dekrementacja - zmniejszenie wartości o jeden
        int d = 0;
        System.out.println("Wartość d to " +d);
        int e = d--;                              //postdekrementacja, odejmujemy od razu wartość d a z e czekamy
        System.out.println("Wartość e to " + e); //0
        System.out.println("Wartość d to" + d); // -1
        int f = --d;                             //predekrementacja
        System.out.println("Wartość f to " + f); //-2
        System.out.println("Wartość d to " + d); //-2
    }
}
