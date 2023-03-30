package seminars.seminar2;

public class Goat extends Herbivore implements Walkable{
    public Goat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Бее-е";
    }

    @Override
    public int runSpeed() {
        return 35;
    }
}
