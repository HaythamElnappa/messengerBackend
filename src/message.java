
public class message {
	
	// the private variable 
	
	private int id;
	private String body;
	private int senderId;
	private int receivedId;
	
	// functions
	public message (int id , String body) {
		this.id = id;
		this .body =body;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	

}
