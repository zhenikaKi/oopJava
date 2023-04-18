package seminars.seminar6.HomeWork;

public class PersisterImpl implements Persister {

	@Override
	public void save(User user){
		System.out.println("Save user: " + user);
	}
}