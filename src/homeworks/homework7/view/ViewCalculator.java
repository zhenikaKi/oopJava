package homeworks.homework7.view;

import homeworks.homework7.math.Calculable;
import homeworks.homework7.model.NumberParsable;

import java.util.Scanner;

/** Отображение калькулятора  */
public class ViewCalculator<T> {
    private Scanner scanner = new Scanner(System.in);

    private final Calculable<T> calculator;
    private final NumberParsable<T> parser;

    public ViewCalculator(Calculable<T> calculator, NumberParsable<T> parser) {
        this.calculator = calculator;
        this.parser = parser;
    }

    /** Запустить калькулятор */
    public void run() {
        while (true) {
            try {
                System.out.print(getCommands());
                int cmd = scanner.nextInt();
                boolean isExit = false;
                switch (cmd) {
                    case 0:
                        isExit = true;
                        break;
                    case 1:
                        operSum();
                        break;
                    case 2:
                        operSubtraction();
                        break;
                    default: throw new RuntimeException(String.format("Некорректная команда \"%s\"", cmd));
                }

                if (isExit) {
                    break;
                }
            }
            catch (Exception e) {
                System.out.println("Ошибка ввода команды: " + e.getMessage());
            }
        }
    }

    /** Сложить числа */
    private void operSum() {
        T first = inputNumber(String.format("Введите первое число в виде %s: ", parser.getStringExample()));
        T second = inputNumber(String.format("Введите второе число в виде %s: ", parser.getStringExample()));

        T result = calculator.addition(first, second);
        System.out.println("Сумма: " + result);
    }

    /** Вычисть числа */
    private void operSubtraction() {
        T first = inputNumber(String.format("Введите первое число в виде %s: ", parser.getStringExample()));
        T second = inputNumber(String.format("Введите второе число в виде %s: ", parser.getStringExample()));

        T result = calculator.subtraction(first, second);
        System.out.println("Разность: " + result);
    }

    /**
     * Ввести число с клавиатуры.
     * @param example Пример, в каком виде нужно вводить число.
     * @return Распарсенное число из введенной строки.
     */
    private T inputNumber(String example) {
        boolean correct = false;
        T result = null;
        while (!correct) {
            try {
                System.out.print(example);
                String value = scanner.next();
                result = parser.parse(value);
                correct = true;
            }
            catch (Exception e) {
                System.err.println("Возникла ошибка при преобразовании: " + e.getMessage());
            }
        }
        return result;
    }


    private String getCommands() {
        return "0 - выход\n" +
                "1 - сложение\n" +
                "2 - вычитание\n" +
                "Введите команду: ";
    }
}
