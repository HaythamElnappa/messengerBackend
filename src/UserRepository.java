import java.util.ArrayList;

public class UserRepository {
	
	//the composition of User
	private ArrayList<User> users = new ArrayList<User>() ;
	
	// the function
	public void AddUser(User a) {
		this.users.add(a);
	}
	
	public ArrayList getAllUsers() {
		return users;
	}
	
	public void RemoveUser(User user) {
		this.users.remove(user);
	}
	
	public void print() {
		users.forEach((n) -> System.out.println(n.getName()));
	}
	
	public void RemoveUser(int id) {
		for(int i=0 ; i<users.size();i++) {
			if(users.get(i).getId()==id) {
				users.remove(this.users.get(i));
			}
			
		}
	}
	
	public User getElementById(int id) {
		for(int i=0 ; i<users.size();i++) {
			if(users.get(i).getId()==id) {
				return this.users.get(i);
			}
			
		}
		return null;
	}
	

}
