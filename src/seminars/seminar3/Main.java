import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personal form1 = new Personal();
        form1.addUser(new User("Иван", 20))
                .addUser(new User("Василий", 32))
                .addUser(new User("Елена", 24))
                .addUser(new User("Иван", 21))
                .addUser(new User("Василий", 42))
                .addUser(new User("Елена", 21));

        //System.out.println(form1);

        for (User item:form1) {
            System.out.println(item);
        }

        List<User> compUsers = form1.toList();
        Collections.sort(compUsers);

        for (int i = 0; i < compUsers.size(); i++) {
            System.out.println(compUsers.get(i));
        }

        User boss = new User("Инокентий", 52);
        boss.setSubordination(form1);
        Personal form2 = new Personal();
        User pavel = new User("Павел", 42);
        pavel.setSubordination(new Personal().addUser(new User("Алевтина", 21)));
        form2.addUser(pavel)
                .addUser(boss);
        User bigBoss = new User("Ольга", 25);
        bigBoss.setSubordination(form2);

        System.out.println(form2);
        System.out.println(bigBoss);


        System.out.println();
        System.out.println();

        Company firma = new Company(bigBoss);
        for (User item:firma) {
            System.out.println(item);
        }

    }


}