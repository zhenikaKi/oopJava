package seminars.seminar4;

import homeworks.homework4.Shield;

import java.util.Random;

public abstract class Warrior<T extends Weapon, S extends Shield> extends Personage{

    protected T weapon;
    protected S shield;

    public Warrior(String name, int hp, T weapon, S shield) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;
    }
    public int harm(){
        boolean isHit = Main.rnd.nextBoolean();
        int damage = 0;
        if (isHit){
            damage = Main.rnd.nextInt(weapon.damage()+1);
        }
        return damage;
    }

    public S getShield() {
        return shield;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Воин \n")
                .append(this.getName())
                .append(String.format("\n\tHp: %d, щит: %d", getHp(), shield.getProtection()))
                .append(String.format("\n\tВооружен: %s", this.weapon));
        return res.toString();
    }
}
