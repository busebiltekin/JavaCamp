package campHomework3;

public class UserManager {
	
	public void add (User user) {
		System.out.println(user.getId()+ user.getFirstName() + user.getLastName() + " sisteme eklendi");
	}
	
	public void login (User user) {
		System.out.println(user.getFirstName() + ", Hoþgeldin");
	}

}
