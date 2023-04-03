package homeworks.homework2;

import seminars.seminar2.Animal;

public class BoneFish extends Animal implements Swimable {

    private int speed;

    public BoneFish(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public String speak() {
        return "Буль-буль";
    }

    @Override
    public String feed (){
        return "Водоросли";
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
