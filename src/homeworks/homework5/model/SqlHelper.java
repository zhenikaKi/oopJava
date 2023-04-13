package homeworks.homework5.model;

import seminars.seminar5.personal.model.User;

public class SqlHelper {

    private final String TABLE_NAME = "phones";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_FIRST_NAME = "first_name";
    public static final String COLUMN_LAST_NAME = "last_name";
    public static final String COLUMN_PHONE = "phone";

    /** Получить запрос создания таблицы */
    String getSqlCreateTable() {
        return String.format("create table if not exists %s (" +
                        "%s integer primary key autoincrement, " +
                        "%s text, " +
                        "%s text, " +
                        "%s text)",
                TABLE_NAME,
                COLUMN_ID,
                COLUMN_FIRST_NAME,
                COLUMN_LAST_NAME,
                COLUMN_PHONE);
    }

    /**
     * Получить запрос добавления новой записи.
     * @param user Пользователь для добавления в базу.
     */
    String getSqlInsert(User user) {
        return String.format("insert into %s (%s, %s, %s) values ('%s', '%s', %s)",
                TABLE_NAME,
                COLUMN_FIRST_NAME,
                COLUMN_LAST_NAME,
                COLUMN_PHONE,
                user.getFirstName(),
                user.getLastName(),
                user.getPhone());
    }

    /**
     * Получить запрос получения пользователя по его идентификатору.
     * @param userId Идентификатор пользователя.
     */
    String getSqlSelect(long userId) {
        return String.format("select * from %s where %s = %s",
                TABLE_NAME,
                COLUMN_ID,
                userId);
    }

    /**
     * Получить запрос обновления пользователя по его идентификатору.
     * @param userId Идентификатор пользователя.
     * @param user Новые данные для пользователя.
     */
    String getSqlUpdate(long userId, User user) {
        return String.format("update %s set %s = '%s', %s = '%s', %s = '%s' where %s = %s",
                TABLE_NAME,
                COLUMN_FIRST_NAME,
                user.getFirstName(),
                COLUMN_LAST_NAME,
                user.getLastName(),
                COLUMN_PHONE,
                user.getPhone(),
                COLUMN_ID,
                userId);
    }

    /**
     * Получить запрос удаления пользователя по его идентификатору.
     * @param userId Идентификатор пользователя.
     */
    String getSqlDelete(long userId) {
        return String.format("delete from %s where %s = %s",
                TABLE_NAME,
                COLUMN_ID,
                userId);
    }

    /** Получить запрос получения всех пользователей */
    String getSqlSelectAll() {
        return String.format("select * from %s",
                TABLE_NAME);
    }
}