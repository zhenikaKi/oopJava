package seminars.seminar4;

import homeworks.homework4.RoundShield;

public class Thief extends Warrior<Knife, RoundShield>{
    public Thief(String name, int hp, Knife weapon, RoundShield shield) {
        super(name, hp, weapon, shield);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
