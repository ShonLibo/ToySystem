//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Toy[] toys = {
                new Car("Toy Car", "A fast red car", "Red", 100),
                new Doll("Barbie doll", "A beautiful doll", "Blonde", "Pink"),
                new Ball("Football", "A big bouncy ball", 10, "Blue")
        };

        System.out.println("Welcome to the Toy Box! Here are the toys:");
        for (Toy toy : toys) {
            System.out.println(toy.name + " " + toy.description);
        }
        int i = 0; // Loop counter
        do {
            if (i < toys.length) {
                toys[i].play();
                i++;
            } else {
                break;
            }
        } while (true);




    }
}