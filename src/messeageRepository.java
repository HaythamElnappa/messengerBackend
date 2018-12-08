import java.util.ArrayList;

public class messeageRepository {
	
	//the composition of message

	private ArrayList<message> messages = new ArrayList<>();
	
	// the function
	
	public ArrayList getAllmessages() {
		return messages;
	}
	
	public void addmessage(message message) {
		this.messages.add(message);
	}
	
	public void removeMessage(message message) {
		this.messages.remove(message);
	}
	
	public void removemessage(int id) {
		for(int i =0 ; i <messages.size();i++) {
			if (messages.get(i).getId()== id) {
				messages.remove(this.messages.get(i));
			}
		}
	}
	
	public message getMessagebyid(int id) {
		for(int i =0 ; i <messages.size();i++) {
			if (messages.get(i).getId()== id) {
				return this.messages.get(i);
			}
		}
		return null;
	}
	
	

}
