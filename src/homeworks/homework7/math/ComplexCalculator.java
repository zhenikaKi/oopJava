package homeworks.homework7.math;

import homeworks.homework7.model.ComplexNumber;
import homeworks.homework7.util.ConsoleLogger;
import homeworks.homework7.util.Logger;

public class ComplexCalculator implements Calculable<ComplexNumber> {
    private static final Logger logger = new ConsoleLogger();

    @Override
    public ComplexNumber addition(ComplexNumber first, ComplexNumber second) {
        double actualPart = first.getActualPart() + second.getActualPart();
        double imaginaryPart = first.getImaginaryPart() + second.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(actualPart, imaginaryPart);
        logger.log(String.format("Сложение: %s + %s = %s", first, second, result));
        return result;
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber first, ComplexNumber second) {
        double actualPart = first.getActualPart() - second.getActualPart();
        double imaginaryPart = first.getImaginaryPart() - second.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(actualPart, imaginaryPart);
        logger.log(String.format("Вычитание: %s - %s = %s", first, second, result));
        return result;
    }
}
