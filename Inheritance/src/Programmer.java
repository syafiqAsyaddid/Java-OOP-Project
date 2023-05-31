
public class Programmer extends Person{
	String technology;
	
	
	
	public Programmer() {
		super();
	}

	public Programmer(String name, String address, String technology) {
		super(name, address);
		this.technology = technology;
	}

	void hacking() {
		System.out.println("I can hack a website");
	}
	
	void coding() {
		System.out.println("I can create a application using technology: " + technology + ".");
	}
	void greeting () {
		super.greeting();
		System.out.println("My job is a " + technology + " programmer.");
	}
}
