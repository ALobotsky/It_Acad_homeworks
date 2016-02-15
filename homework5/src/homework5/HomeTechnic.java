package homework5;

public class HomeTechnic {
	
	public static int u_volt=220;
	  String owner;
	  String producer;
	
	  public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public HomeTechnic(int U_volt, String owner) {
			//super();
			HomeTechnic.u_volt =U_volt;
			this.owner = owner;
			
			//Base Class
		
		}

	public static int getU_volt() {
		return u_volt;
	}

	public static void setU_volt(int u_volt) {
		u_volt = u_volt;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result
				+ ((producer == null) ? 0 : producer.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HomeTechnic other = (HomeTechnic) obj;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		return true;
	}

	
	
}
