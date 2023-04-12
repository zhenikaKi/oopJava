package seminars.seminar5.personal.views;

import java.util.ArrayList;
import java.util.List;

public enum Commands {
    NONE,
    READ,
    CREATE,
    UPDATE,
    LIST,
    DELETE,
    EXIT;

    public static String getList() {
        List<String> values = new ArrayList<>();
        for (Commands command: values()) {
            values.add(command.name());
        }
        return String.join(", ", values);
    }
}
