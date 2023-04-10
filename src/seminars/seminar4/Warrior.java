import java.util.Random;

public abstract class Warrior<T extends Weapon> extends Personage{
protected static Random rnd = new Random();
    protected T weapon;
    public Warrior(String name, int hp, T weapon) {
        super(name, hp);
        this.weapon = weapon;
    }
    public int harm(){
        boolean isHit = rnd.nextBoolean();
        int damage = 0;
        if (isHit){
            damage = rnd.nextInt(weapon.damage()+1);
        }
        return damage;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Воин \n")
                .append(this.getName())
                .append(String.format("\n\tHp: %d", getHp()))
                .append(String.format("\n\tВооружен: %s", this.weapon));
        return res.toString();
    }
}
