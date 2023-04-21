package homeworks.homework7.math;

/** Калькулятор */
public interface Calculable<T> {

    /**
     * Сложение двух чисел.
     * @param first Первое число.
     * @param second Второе число.
     * @return Сумма чисел.
     */
    T addition(T first, T second);

    /**
     * Вычитание двух чисел.
     * @param first Первое число.
     * @param second Второе число.
     * @return Разность чисел.
     */
    T subtraction(T first, T second);
}
