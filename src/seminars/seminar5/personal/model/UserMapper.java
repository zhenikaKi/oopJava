package seminars.seminar5.personal.model;

public class UserMapper {

    private final String fieldSeparator;
    private final String lineSeparator;

    public UserMapper() {
        this.fieldSeparator = "";
        this.lineSeparator = "";
    }

    public UserMapper(String fieldSeparator, String lineSeparator) {
        this.fieldSeparator = fieldSeparator;
        this.lineSeparator = lineSeparator;
    }

    /**
     * Преобразовать пользователя к строке для файла.
     * @param user Пользователь для преобразования.
     * @return Строка с данными по пользователю.
     */
    public String map(User user) {
        StringBuilder line = new StringBuilder()
                .append(user.getId()).append(fieldSeparator)
                .append(user.getFirstName()).append(fieldSeparator)
                .append(user.getLastName()).append(fieldSeparator)
                .append(user.getPhone())
                .append(lineSeparator);
        return line.toString();
    }

    /**
     * Преобразовать строку из файла к пользователю.
     * @param line Строка для преобразования.
     * @return Пользователь.
     */
    public User map(String line) {
        String[] lines = line.split(fieldSeparator);
        return new User(Long.parseLong(lines[0]), lines[1], lines[2], lines[3]);
    }
}
