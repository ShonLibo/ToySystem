public class Ball extends Toy{
    int size;
    String color;

    public Ball(String name, String MoreData, int size, String color) {
        super(name, description);
        this.size = size;
        this.color = color;
    }

    public Ball(String name, String description) {
        super(name, description);
    }

    @Override
    public void play() {

    }
}
