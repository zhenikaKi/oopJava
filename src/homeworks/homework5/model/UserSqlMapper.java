package homeworks.homework5.model;

import seminars.seminar5.personal.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSqlMapper {

    /**
     * Преобразовать результат запроса к пользователю.
     * @param resultSet Результат запроса.
     * @return Пользователь.
     */
    public User map(ResultSet resultSet) throws SQLException {
        return new User(
                resultSet.getLong(SqlHelper.COLUMN_ID),
                resultSet.getString(SqlHelper.COLUMN_FIRST_NAME),
                resultSet.getString(SqlHelper.COLUMN_LAST_NAME),
                resultSet.getString(SqlHelper.COLUMN_PHONE)
        );
    }
}
