package seminars.seminar4;

import homeworks.homework4.MagicShield;
import homeworks.homework4.RoundShield;

import java.util.Random;

public class Main {
    protected static Random rnd = new Random();


    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();
        archers.addPers(new Archer("Робин", 100, new Bow(20), new MagicShield(12)))
                .addPers(new Archer("Гуд", 100, new Bow(15), new MagicShield(25)))
                .addPers(new Archer("Без щита", 100, new Bow(15), new MagicShield(null)));
        thiefTeam.addPers(new Thief("Джек", 150, new Knife(), new RoundShield()))
                .addPers(new Thief("Потрошитель", 150, new Knife(), new RoundShield()));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);

        Archer robin = new Archer("Робин", 50, new Bow(20), new MagicShield(rnd.nextInt(100) +1));
        Archer gud = new Archer("Гуд", 50, new Bow(50), new MagicShield(rnd.nextInt(100) +1));
        Battle fight = new Battle(robin,gud);
        fight.run();
    }
}