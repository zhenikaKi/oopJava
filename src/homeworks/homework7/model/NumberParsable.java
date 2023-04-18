package homeworks.homework7.model;

public interface NumberParsable<T> {

    /** Получить строку-пример, для парсинга */
    String getStringExample();

    /**
     * Преобразовать строку к числу.
     * @param value Число в строковом представлении.
     * @return Преобразованное число.
     */
    T parse(String value);
}
