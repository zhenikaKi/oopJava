package homeworks.homework7.model;

/** Сущность комплексного числа */
public class ComplexNumber {
    /** Действительная часть */
    private final double actualPart;

    /** Мнимая часть */
    private final double imaginaryPart;

    public ComplexNumber(double actualPart, double imaginaryPart) {
        this.actualPart = actualPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getActualPart() {
        return actualPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        return String.format("%.2f+%.2fi", actualPart, imaginaryPart);
    }
}
