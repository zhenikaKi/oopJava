package seminars.seminar7.DecoratorFactory.src.calculator;

import java.util.Date;

public class Logger implements Loggable{
    @Override
    public void log(String message) {
        Date date = new Date();
        System.out.printf("%s \n %s",date.toString(), message);
    }
}
