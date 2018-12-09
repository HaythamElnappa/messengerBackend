import java.util.ArrayList;

public class MesseageRepository {
	
	//the composition of message

	private ArrayList<Message> messages = new ArrayList<>();
	
	// the function
	
	public ArrayList getAllMessages() {
		return messages;
	}
	
	public void addMessage(Message message) {
		this.messages.add(message);
	}
	
	public boolean removeMessage(Message message) {
		if(messages.contains(message)) {
		this.messages.remove(message);
		return true;
		}
		return false;
	}
	
	public boolean removeMessage(int id) {
		for(int i =0 ; i <messages.size();i++) {
			if (messages.get(i).getId()== id) {
				messages.remove(this.messages.get(i));
				return true;
			}
		}
		return false;
	}
	
	public Message getMessageById(int id) {
		for(int i =0 ; i <messages.size();i++) {
			if (messages.get(i).getId()== id) {
				return this.messages.get(i);
			}
		}
		return null;
	}
	
	

}
