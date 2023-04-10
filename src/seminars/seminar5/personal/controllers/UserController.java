package seminars.seminar5.personal.controllers;

import seminars.seminar5.personal.model.Repository;
import seminars.seminar5.personal.model.User;

import java.util.List;

public class UserController {

    private final Validat valid = new Validat();
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        valid.validate(user);
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }

    public List<User> allUsers() {
        return repository.getAllUsers();

    }
    public void updateUser(User user){
        valid.validate(user);
        repository.updateUser(user);
    }
}
