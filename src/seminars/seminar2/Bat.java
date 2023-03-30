package seminars.seminar2;

public class Bat extends Predator implements Flyable{
    public Bat(String name) {
        super(name);
    }

    @Override
    public String feed (){
        return "Насекомые";
    }
    @Override
    public String speak() {
        return "Sssss";
    }

    @Override
    public int flySpeed() {
        return 70;
    }
}
