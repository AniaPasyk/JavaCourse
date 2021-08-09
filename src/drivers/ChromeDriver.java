package drivers;

import drivers.WebDriver;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println( " Otwieram przeglądarkę za pomocą Chrome");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajuje element za pomocą przeglądarki Chrome");

    }
}
