package homeworks.homework5.model;

import seminars.seminar5.personal.model.DictionaryStorage;
import seminars.seminar5.personal.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/** Реализация хранилища справочника в БД */
public class DictionaryStorageDb implements DictionaryStorage {

    private final Connection connection;
    private final Statement statement;
    private final SqlHelper sqlHelper;
    private final UserSqlMapper userMapper;

    /**
     * Инициализация хранилища.
     * @param dbName Имя базы данных.
     */
    public DictionaryStorageDb(String dbName) {
        try {
            sqlHelper = new SqlHelper();
            userMapper = new UserSqlMapper();

            DriverManager.registerDriver(new org.sqlite.JDBC());
            connection = DriverManager.getConnection(String.format("jdbc:sqlite:%s", dbName));
            statement = connection.createStatement();

            createTable();
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка инициализации БД", e);
        }
    }

    @Override
    public long insertUser(User user) {
        try {
            statement.execute(sqlHelper.getSqlInsert(user));
            return statement.getGeneratedKeys().getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка добавления записи", e);
        }
    }

    @Override
    public User getUser(long userId) {
        try {
            ResultSet resultSet = statement.executeQuery(sqlHelper.getSqlSelect(userId));
            if (resultSet.next()) {
                return userMapper.map(resultSet);
            }
            resultSet.close();

            return null;
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка получения записи", e);
        }
    }

    @Override
    public void updateUser(User user) {
        try {
            statement.execute(sqlHelper.getSqlUpdate(user.getId(), user));
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка обновления записи", e);
        }
    }

    @Override
    public void deleteUser(long userId) {
        try {
            statement.execute(sqlHelper.getSqlDelete(userId));
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка удаления записи", e);
        }
    }

    @Override
    public List<User> readAllUsers() {
        List<User> result = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery(sqlHelper.getSqlSelectAll());
            while (resultSet.next()) {
                result.add(userMapper.map(resultSet));
            }
            resultSet.close();

            return result;
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка получения записей", e);
        }
    }

    @Override
    public void closeStorage() {
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
        }
    }

    /** Создать таблицу в БД, если ее нет */
    private void createTable() throws SQLException {
        statement.execute(sqlHelper.getSqlCreateTable());
    }
}
