package homeworks.homework7;

import homeworks.homework7.math.Calculable;
import homeworks.homework7.math.ComplexCalculator;
import homeworks.homework7.model.ComplexNumber;
import homeworks.homework7.model.ComplexParser;
import homeworks.homework7.model.NumberParsable;
import homeworks.homework7.view.ViewCalculator;

/**
 * 1. Написать проект калькулятор для комплексных чисел, с элементами логирования действий пользователя.
 * Достаточно сделать хотя-бы два действия.
 * 2. Продумать, какие паттерны можно использовать в вашем проекте
 */
public class Main {
    public static void main(String[] args) {
        Calculable<ComplexNumber> calculator = new ComplexCalculator();
        NumberParsable<ComplexNumber> parser = new ComplexParser();
        ViewCalculator<ComplexNumber> viewCalculator = new ViewCalculator<>(calculator, parser);
        viewCalculator.run();
    }
}
