package seminars.seminar5.personal;

import seminars.seminar5.personal.controllers.UserController;
import seminars.seminar5.personal.model.FileOperation;
import seminars.seminar5.personal.model.FileOperationImpl;
import seminars.seminar5.personal.model.Repository;
import seminars.seminar5.personal.model.RepositoryFile;
import seminars.seminar5.personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
