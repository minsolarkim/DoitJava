package array;

import java.util.ArrayList;

public class Dog {

	private String name;
	private String type;

	public Dog(String name, String type) { //void 붙이면 안된다!!!
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String showDogInfo() { //다 String이라 되는 건가!!
		return name + ","+ type;
	}
}
