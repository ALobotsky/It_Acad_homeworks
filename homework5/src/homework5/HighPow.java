package homework5;

public class HighPow extends Household {

	// Class Level 2 (mini parent)
	
	public int consum;
	public String place;
	

	public HighPow(int U_volt, String owner) {
		super(U_volt, owner);
		// TODO Auto-generated constructor stub
	}


	public int getConsum() {
		return consum;
	}


	public void setConsum(int consum) {
		consum = consum;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + consum;
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		return result;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HighPow other = (HighPow) obj;
		if (consum != other.consum)
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		return true;
	}

	
	

}
