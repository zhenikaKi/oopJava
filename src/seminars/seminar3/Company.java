import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User>{

    User bigBoss;
    public Company(User bigBoss) {
        this.bigBoss = bigBoss;
    }

    List<SubUser> deepTree (User boss, int lvl){
        List<SubUser> result = new ArrayList<>();
        result.add(new SubUser(boss, lvl));
        if (boss.getSubordination() == null || boss.getSubordination().size()==0){
            return result;
        }
        for (User item: boss.getSubordination()) {
            result.addAll(deepTree(item, lvl+3));
        }
        return result;
    }
    @Override
    public Iterator <User> iterator() {
        return new iterator2();
    }
    private class iterator2 implements Iterator<User> {

        List<SubUser> users = deepTree(bigBoss, 1);
        Iterator <SubUser> countUser = users.iterator();
        @Override
        public boolean hasNext() {
            return countUser.hasNext();
        }

        @Override
        public User next() {
            return countUser.next();
        }
    }
}
