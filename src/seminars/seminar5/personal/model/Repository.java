package seminars.seminar5.personal.model;

import java.util.List;

/** Работа с хранилищем справочника */
public interface Repository {
    List<User> getAllUsers();
    long createUser(User user);

    User getUser(long userId);

    void updateUser(User user);

    void deleteUser(long userId);
}
