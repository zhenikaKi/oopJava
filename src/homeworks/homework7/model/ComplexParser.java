package homeworks.homework7.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComplexParser implements NumberParsable<ComplexNumber> {

    @Override
    public String getStringExample() {
        return "<a>+<b>i, где <a> - действительная часть, <b> - мнимая часть числа";
    }

    @Override
    public ComplexNumber parse(String value) {
        Pattern pattern = Pattern.compile("(\\d+)\\+(\\d+)i");
        Matcher matcher = pattern.matcher(value);
        if (matcher.find()) {
            double first = Double.parseDouble(matcher.group(1));
            double second = Double.parseDouble(matcher.group(2));
            return new ComplexNumber(first, second);
        }
        throw new RuntimeException("Некорректная строка");
    }
}
