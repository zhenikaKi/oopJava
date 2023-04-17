package seminars.seminar6.Solid7Dip.src.solid;


import seminars.seminar6.Solid7Dip.src.solid.dip.ConsoleReport;
import seminars.seminar6.Solid7Dip.src.solid.dip.PrintReport;
import seminars.seminar6.Solid7Dip.src.solid.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.output(new PrintReport());
        report.output(new ConsoleReport());
    }
}
