public class Truck implements Vehicle {
    @Override
    public void jazd(int speed) {
        System.out.println("Jade ciężarówką z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuję ciężarówką!");

    }

    @Override
    public String info() {
        return "Ciężarówka";
    }
}
