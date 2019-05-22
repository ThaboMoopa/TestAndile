
public class Account {
	
	//static variable for a single_instance
	private static Account single_instance = null;
	
	//variable of type String
	public String single;
	
	//private constructor is restricted to itself 
	private Account() {
		single = "This is the part of the Singleton class";
	}
	
	//static method to provide a global access point class
	public static Account getInstance() {
		//to ensure that only one instance is created
		if(single_instance == null) {
			
		single_instance = new Account();
		}
		return single_instance;
	}
}
