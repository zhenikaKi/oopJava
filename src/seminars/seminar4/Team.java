package seminars.seminar4;

import homeworks.homework4.Shield;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Personage> implements Iterable<T>{
    List<T> personages = new ArrayList<>();
    @Override
    public Iterator<T> iterator() {
        return personages.iterator();
    }

    public Team<T> addPers (T personage){
        this.personages.add(personage);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (T personage:this) {
            res.append(personage)
                    .append("\n");
        }
        res.append(String.format("Максимальная дальность: %d", maxRange()));
        res.append(String.format("\nМинимальный щит: %d", gitMinShield()));
        return res.toString();
    }

    public int maxRange (){
        int max = 0;
        for (T pers:this) {
            if (pers instanceof Archer){
                Archer archer = (Archer) pers;
                if(archer.range()>max){
                    max= archer.range();
                }
            }
        }
        return max;
    }

    public Integer gitMinShield () {
        Integer min = null;
        for (T pers: this) {
            if (pers instanceof Warrior) {
                Integer protector =  ((Warrior<?, ?>) pers).getShield().getProtection();
                if (protector == null) {
                    continue;
                }

                if(min == null || protector < min){
                    min = protector;
                }
            }
        }
        return min;
    }
}
