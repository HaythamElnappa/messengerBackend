
public class Message {
	
	// the private variable 
	
	private int id;
	private String body;
	private int senderId;
	private int receivedId;
	
	// functions
	public Message (int id , String body) {
		this.id = id;
		this .body =body;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getSenderId() {
		return this.senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public int getReceivedId() {
		return this.receivedId;
	}

	public void setReceivedId(int receivedId) {
		this.receivedId = receivedId;
	}
	

}
