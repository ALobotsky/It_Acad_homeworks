package homework5;

public class Microwave extends HighPow {
	
	// final real object
	
	public String colour;
	public boolean set;
	

	public Microwave(int U_volt, String owner) {
		super(U_volt, owner);
		
	}

	//public Microwave() {
		//super(consum, colour);
		//this.colour = colour;
		//this.set = set;
		
	//}

	public Microwave(int U_volt, String owner, String colour, boolean set) {
		super(U_volt, owner);
		this.colour = colour;
		this.set = set;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isSet() {
		return set;
	}

	public void setSet(boolean set) {
		this.set = set;
	}
	
	
	
}
