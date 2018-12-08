
public class User {
	// the private variable 
	private int id;
	private String name;
	private String password;
	
	// the contractor
	
	public User(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	//the public getter and setter for the variable

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
	
	
	
	

}
