package seminars.seminar5.personal.model;

import java.util.List;

/** Реализация работы с хранилищем через файл */
public class RepositoryImpl implements Repository {
    private final DictionaryStorage dictionaryStorage;

    public RepositoryImpl(DictionaryStorage dictionaryStorage) {
        this.dictionaryStorage = dictionaryStorage;
    }

    @Override
    public List<User> getAllUsers() {
        return dictionaryStorage.readAllUsers();
    }

    @Override
    public long createUser(User user) {
        return dictionaryStorage.insertUser(user);
    }

    @Override
    public User getUser(long userId) {
        return dictionaryStorage.getUser(userId);
    }

    @Override
    public void deleteUser(long userId) {
        dictionaryStorage.deleteUser(userId);
    }

    @Override
    public void updateUser(User user) {
        User savedUser = getUser(user.getId());
        savedUser.setFirstName(user.getFirstName());
        savedUser.setLastName(user.getLastName());
        savedUser.setPhone(user.getPhone());
        dictionaryStorage.updateUser(savedUser);
    }
}
