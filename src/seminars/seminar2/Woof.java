package seminars.seminar2;

public class Woof extends Predator implements Walkable{
    public Woof(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Уууррр";
    }

    @Override
    public int runSpeed() {
        return 40;
    }
}
