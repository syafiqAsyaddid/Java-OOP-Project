
public class Person {
	String name;
	String address;
	
	Person(){
		super();
	}

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	void greeting() {
		System.out.println("Hello my name is " + name + ".");
		System.out.println("I, Came from " + address + ".");
	}
}
