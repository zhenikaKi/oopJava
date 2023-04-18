package seminars.seminar6.HomeWork;

public class ReportImpl implements Report {

    @Override
    public void report(User user){
        System.out.println("Report for user: " + user);
    }
}
