package homework5;

public class Household extends HomeTechnic{
	
	private String Purpose;
	

	public Household(int U_volt, String owner) {
		super(U_volt, owner);
		// Parent's Class Level 2
	
	}

	public String getPurpose() {
		return Purpose;
	}

	public void setPurpose(String purpose) {
		Purpose = purpose;
	}

	

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Purpose == null) ? 0 : Purpose.hashCode());
		
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Household other = (Household) obj;
		if (Purpose == null) {
			if (other.Purpose != null)
				return false;
		} else if (!Purpose.equals(other.Purpose))
			return false;
		return false;
		
	}

	
	
}
