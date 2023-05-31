public class Person {
	String name;
	String address;
	final String country = "Indonesia";
	
	Person(){
		
	}
	Person(String paramName){
		name = paramName;
	}
	
	Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	
	void sayHello(String paramName) {
		System.out.println("Hello " + paramName + ", My name is " + name + ".");
	}
	
	String sayAddress() {
		return "I, Came from " + address + ".";
	}
}
