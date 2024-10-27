public class Doll  extends Toy {

    String hairColor;
    String dressColor;

    public Doll(String name, String description, String hairColor, String dressColor) {
        super(name, description);
        this.hairColor = hairColor;
        this.dressColor = dressColor;
    }

    public Doll(String name, String description) {
        super(name, description);
    }

    @Override
    public void play() {

    }
}
