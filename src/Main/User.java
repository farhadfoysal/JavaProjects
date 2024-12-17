package Main;

public class User {
	private String id;
	private String name;
	private String phone;
	private String email;
	private String pass;
	private float bal;
	
	User(){
		
	}
	User(String id, String n, String e, String p, String pass, float bal){
		this.name = n;
		this.phone = p;
		this.email = e;
		this.bal = bal;
		this.pass = pass;
		
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getPass() {
		return this.pass;
	}
	public float getbal() {
		return this.bal;
	}
}
