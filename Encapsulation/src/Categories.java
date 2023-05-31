
public class Categories {
	int id;
	String name;
	boolean expensive;
	
	public Categories() {
		super();
	}
	public Categories(int id, String name, boolean expensive) {
		super();
		this.id = id;
		this.name = name;
		this.expensive = expensive;
	}
	
	public boolean isExpensive() {
		return this.expensive;
	}
	public void setExpensive(boolean expensive) {
		this.expensive = expensive;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
