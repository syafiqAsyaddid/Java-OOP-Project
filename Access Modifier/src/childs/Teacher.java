package childs;
import parents.Person;

public class Teacher extends Person {
	public String subject;
	
	
	
	public Teacher() {
		
	}
	public Teacher(String name, String address, String subject) {
		super(name, address);
		this.subject = subject;
	}
	public void teaching() {
		System.out.println("I can teach " + subject + ", So anyone how wants to learn can talk to me");
	}
	public void greeting () {
		System.out.println("Hello my name is " + name + ".");
		System.out.println("I, Came from " + address + ".");
		System.out.println("My job is a " + subject + " Teacher.");
	}
}
