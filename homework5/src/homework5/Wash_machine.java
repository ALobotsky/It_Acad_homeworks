package homework5;

import java.util.Scanner;

public class Wash_machine extends HighPow {
	
	// final real object
	
   public float weight;
   public boolean set;
   
	public Wash_machine(int U_volt, String owner) {
		super(U_volt, owner);
		
	}

	

	
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (set ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(weight);
		return result;
	}




	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wash_machine other = (Wash_machine) obj;
		if (set != other.set)
			return false;
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
			return false;
		return true;
	}




	public float getWeight() {
		return weight;
	}




	public void setWeight(float weight) {
		this.weight = weight;
	}




	public void setSet(boolean set) {
		this.set = set;
	}




	public Wash_machine(int U_volt, String owner, float weight, boolean set) {
		super(U_volt, owner);
		this.weight = weight;
		this.set = set;
	}

	public boolean isSet() {
		
		return isSet();
	}
	
	 public static void Rozetka (Wash_machine wash_machine) {
		 Scanner scanner = new Scanner(System.in);
		
		 scanner.nextLine();
		 System.out.println("\n Enter to socket? 0-out or 1-in");
		 
		 if (scanner.hasNext("[0]"))
			 wash_machine.setSet(false);
			 else if (scanner.hasNext("[1]"))
			 wash_machine.setSet(true);
			 else {
			 while (!scanner.hasNext("[01]")) {
			 if (scanner.hasNext("[0]")) {
			 wash_machine.setSet(false);
			 break;
			 } else if (scanner.hasNext("[1]")) {
			 wash_machine.setSet(true);
			 } else {
			 System.out.println("\n Don't play with 220!" +
			 "\n 1 or 0");
			 scanner.next();
			 }
			 }
			 }
			 return;
		 
	 }
}
