public class Car extends Toy{

     String color;
     int speed;

    public Car(String name, String description) {
        super(name, description);
    }

    public Car(String name, String description, String color, int speed) {
        super(name, description);
        this.color = color;
        this.speed = speed;
    }

    @Override
    public void play() {

    }
}
