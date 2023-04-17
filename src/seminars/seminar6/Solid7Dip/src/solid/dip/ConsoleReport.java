package seminars.seminar6.Solid7Dip.src.solid.dip;

import java.util.List;

public class ConsoleReport implements Reportable{
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Консольный вывод");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}
