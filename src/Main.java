import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserRepository groupOneOfUsers = new UserRepository();
		MesseageRepository groupOneOfMessages = new MesseageRepository();
		
		seed(groupOneOfUsers,groupOneOfMessages);
		
		groupOneOfUsers.print();
		
		
		
	}
	
	// method for seed
	
	public static void seed (UserRepository userRepository,MesseageRepository messeageRepository) {
		
		// users
		User u1 = new User(10,"haytham","111");
		User u2 = new User(20,"nada","222");
		User u3 = new User(30,"mostafa","333");
		User u4 = new User(40,"mahmoud","444");
		User u5 = new User(50,"islam","555");
		
		//messages
		Message m1 = new Message(10,"hi haytham");
		Message m2 = new Message(20,"hi nada");
		Message m3 = new Message(30,"hi mostafa");
		Message m4 = new Message(40,"hi mahoud");
		Message m5 = new Message(50,"hi islam");
		
		userRepository.addUser(u1);
		userRepository.addUser(u2);
		userRepository.addUser(u3);
		userRepository.addUser(u4);
		userRepository.addUser(u5);
		
		messeageRepository.addMessage(m1);
		messeageRepository.addMessage(m2);
		messeageRepository.addMessage(m3);
		messeageRepository.addMessage(m4);
		messeageRepository.addMessage(m5);
		
		
		
		
		
		
	}

}
