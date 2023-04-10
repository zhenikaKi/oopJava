package homeworks.homework4;

/**
 * На основе работы на уроке.
 * Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors обобщения в виде щитов.
 * Реструктуризировать код в конечных классах семейства Warriors.
 * Добавить метод определения минимального щита члена команды в команде.
 * * Продумать, как можно сделать воина без щита.
 */
public abstract class Shield {

    private final Integer protection;

    public Shield() {
        protection = null;
    }

    public Shield(Integer protection) {
        this.protection = protection;
    }

    /**
     * Получить значение защиты.
     * @return щит или null, если щита нет.
     */
    public Integer getProtection() {
        return protection;
    }
}
