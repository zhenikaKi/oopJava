package seminars.seminar5.personal.model;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/** Реализация хранилища справочника в файле */
public class DictionaryStorageFile implements DictionaryStorage {

    private final String fileName;
    private final String lineSeparator;

    private final UserMapper mapper;

    /**
     * Инициализация хранилища в файле.
     * @param fileName Имя файла.
     * @param fieldSeparator Разделитель значений одной записи (между именем, фамилией и телефоном).
     * @param lineSeparator Разделитель между записями.
     */
    public DictionaryStorageFile(String fileName, String fieldSeparator, String lineSeparator) {
        this.fileName = fileName;
        this.lineSeparator = lineSeparator;
        mapper = new UserMapper(fieldSeparator, lineSeparator);

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public long insertUser(User user) {
        user.setId(getNewUserId());
        saveUser(user, true);
        return user.getId();
    }

    @Override
    public User getUser(long userId) {
        List<User> users = readAllUsers();
        for (User item : users) {
            if (item.getId() == userId) {
                return item;
            }
        }
        return null;
    }

    @Override
    public void updateUser(User user) {
        List<User> users = readAllUsers();
        for (User item: users) {
            if (item.getId() == user.getId()) {
                item.setFirstName(user.getFirstName());
                item.setLastName(user.getLastName());
                item.setPhone(user.getPhone());
            }
        }
        saveAllUsers(users);
    }

    @Override
    public void deleteUser(long userId) {
        List<User> users = readAllUsers();
        List<User> newUsers = new ArrayList<>();
        for (User item: users) {
            if (item.getId() != userId) {
                newUsers.add(item);
            }
        }
        saveAllUsers(newUsers);
    }

    @Override
    public List<User> readAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            //считаем сразу все строки
            byte[] bytes = Files.readAllBytes(Paths.get(fileName));
            String[] lines = (new String(bytes)).split(lineSeparator);
            for (String line: lines) {
                if (!line.isEmpty()) {
                    users.add(mapper.map(line));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public void closeStorage() {
    }

    /** Сформировать новый идентификатор пользователя */
    private long getNewUserId() {
        List<User> users = readAllUsers();
        long max = 0;
        for (User item : users) {
            long id = item.getId();
            if (max < id) {
                max = id;
            }
        }
        return max + 1;
    }

    /**
     * Сохранить всех пользователей в файл.
     * @param users Список пользователей для сохранения.
     */
    private void saveAllUsers(List<User> users) {
        boolean appended = false;
        for (User user: users) {
            saveUser(user, appended);
            appended = true;
        }
    }

    /**
     * Сохранить пользователя в файл.
     * @param user Пользователь для сохранения.
     * @param appended True - пользователя нужно добавить в конец файла,
     * false - пользователя нужно сохранить в пустой файл.
     */
    private void saveUser(User user, boolean appended) {
        try (FileWriter writer = new FileWriter(fileName, appended)) {
            String line = mapper.map(user);
            writer.write(line);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
