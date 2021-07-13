//instrukcje warunkowe pozwalają nam określać które częsci kodu mają zostać wykonane, gdy zostanie spełniony warunek

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 0.0F;
        if (dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna / dzielnik);
        } else {
            System.out.println("Prosze podaj inną liczbę");
        }
    }}

