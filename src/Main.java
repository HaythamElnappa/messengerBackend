import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User(10 , "ahmed");
		User u2 = new User(20 , "mahmoud");
		
		UserRepository g1 = new UserRepository();
		
		g1.AddUser(u1);
		g1.AddUser(u2);
		
		message m1 = new message(30,"hi mahmoud");
		message m2 = new message(40, "hi hossam");
		
		messeageRepository gm = new messeageRepository();
		
		gm.addmessage(m1);
		gm.addmessage(m2);
		
		gm.removemessage(30);
		System.out.println(gm.getAllmessages());
		
				
		
	}

}
