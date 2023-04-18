package seminars.seminar6.HomeWork;

public class Main {
	public static void main(String[] args) {
		PersisterImpl persister = new PersisterImpl();
		Report report = new ReportImpl();
		User user = new User("Bob");
		report.report(user);
		persister.save(user);
	}
}