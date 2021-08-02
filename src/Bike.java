public class Bike implements Vehicle {
    @Override
    public void jazd(int speed) {
        System.out.println("Jade rowerem z prędkością" + speed);
    }


    @Override
    public void stop() {
        System.out.println("Hamuje!");

    }

    @Override
    public String info() {
        return "Rower";
    }

    public void zatankuj(){

        System.out.println("Aby mieć duzo siły musze zjeść obiad");
    }
}
