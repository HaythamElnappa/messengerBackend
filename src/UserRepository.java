import java.util.ArrayList;

public class UserRepository {
	
	//the composition of User
	private ArrayList<User> users = new ArrayList<User>() ;
	
	// the convention
	public void addUser(User a) {
		this.users.add(a);
	}
	
	public ArrayList getAllUsers() {
		return users;
	}
	
	public boolean removeUser(User user) {
		if(users.contains(user)) {	
			this.users.remove(user);
			return true;
			}
		return false;
		
	}
	
	public void print() {
		users.forEach((n) -> System.out.println(n.getName()));
	}
	
	public boolean removeUserById(int id) {
		for(int i=0 ; i<users.size();i++) {
			if(users.get(i).getId()==id) {
				users.remove(this.users.get(i));
				return true;
			}
			
		}
		return false;
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
