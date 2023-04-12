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
        repository.createUser(user);
    }

    public User readUser(long userId) throws Exception {
        User user = repository.getUser(userId);
        if (user != null) {
            return user;
        }

        throw new Exception("User not found");
    }

    public void deleteUser(long userId) throws Exception {
        User user = repository.getUser(userId);
        if (user != null) {
            repository.deleteUser(userId);
            return;
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
