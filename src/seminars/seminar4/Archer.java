package seminars.seminar4;

import homeworks.homework4.MagicShield;

public class Archer extends Warrior<Throwing, MagicShield>{
    public Archer(String name, int hp, Throwing weapon, MagicShield shield) {
        super(name, hp, weapon, shield);
    }

    public int range(){
        return Main.rnd.nextInt(this.weapon.range)+1;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
