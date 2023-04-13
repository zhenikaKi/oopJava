package seminars.seminar5.personal;

import homeworks.homework5.model.RepositoryFactory;
import seminars.seminar5.personal.controllers.UserController;
import seminars.seminar5.personal.model.*;
import seminars.seminar5.personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        Repository repository = RepositoryFactory.create();
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
