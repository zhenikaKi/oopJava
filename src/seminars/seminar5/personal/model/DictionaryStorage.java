package seminars.seminar5.personal.model;

import java.util.List;

/** Хранилище справочника */
public interface DictionaryStorage {

    /**
     * Сохранить пользователя в хранилище.
     * @param user Пользователь для сохранения.
     * @return Идентификатор Нового пользователя.
     */
    long insertUser(User user);

    /**
     * Получить пользователя по его идентификатору.
     * @param userId Идентификатор пользователя.
     * @return Найденный пользователь.
     */
    User getUser(long userId);

    /**
     * Обновить пользователя в хранилище.
     * @param user Пользователь для обновления.
     */
    void updateUser(User user);

    /**
     * Удалить пользователя по его идентификатору.
     * @param userId Идентификатор пользователя.
     */
    void deleteUser(long userId);

    List<User> readAllUsers();

    /** Закрытия хранилища */
    void closeStorage();
}
