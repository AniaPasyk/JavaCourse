public class MetodyTest {

    public static void main(String[] args){
        Metody metody = new Metody();
      /*  metody.policzWyynik();
        int result = metody.pobierzWynik();
        int result2 = result *2;
        System.out.println("Rezultat przed mnożeniem to " + result);
        System.out.println("Rezultat po mnożeniu to: " + result2); */

        metody.policzWyynikParam(2);
        metody.policzWyynikParam(100);
        metody.policzWyynikParam(23);

       int result = metody.add(2,3,"Hello1");
        System.out.println(metody.add(2,6,"Hello2"));
        System.out.println(result);
    }
}
