package seminars.seminar5.personal.views;

import seminars.seminar5.personal.controllers.UserController;
import seminars.seminar5.personal.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String commandList = Commands.getList();
                String command = prompt(String.format("Введите команду (%s): ", commandList));
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        create();
                        break;
                    case READ:
                        read();

                        break;
                    case LIST:
                        list();
                        break;
                    case UPDATE:
                        updateUser();
                        break;
                    case DELETE:
                        deleteUser();
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }

    private void deleteUser() throws Exception {
        long id = Long.parseLong(prompt("Идентификатор пользователя: "));
        userController.deleteUser(id);
    }

    private void updateUser() throws Exception {
        long id = Long.parseLong(prompt("Идентификатор пользователя: "));
        User user = userController.readUser(id);
        System.out.println(user);
        System.out.println();
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.updateUser(new User(id, firstName, lastName, phone));
    }

    private void create() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.saveUser(new User(firstName, lastName, phone));
    }

    private void read() throws Exception {
        long id = Long.parseLong(prompt("Идентификатор пользователя: "));
        User user = userController.readUser(id);
        System.out.println(user);
    }

    private void list() {
        List<User> allUsers = userController.allUsers();
        for (User user : allUsers) {
            System.out.println(user);
            System.out.println();
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
