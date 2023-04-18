package seminars.seminar6.HomeWork;

public class User {
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return getName();
	}
}