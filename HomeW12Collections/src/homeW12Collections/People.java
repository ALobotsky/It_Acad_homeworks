package homeW12Collections;

public class People {


		private String fam;
		private String name;
		private String patname;
		
		public People() {
			super();
		}
		
		public People(String fam, String name, String otch) {
			super();
			this.fam = fam;
			this.name = name;
			this.patname = otch;
		}


		public String getFam() {
			return fam;
		}
		public void setFam(String fam) {
			this.fam = fam;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public String getOtch() {
			return patname;
		}
		public void setOtch(String otch) {
			this.patname = otch;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((fam == null) ? 0 : fam.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((patname == null) ? 0 : patname.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			People other = (People) obj;
			if (fam == null) {
				if (other.fam != null)
					return false;
			} else if (!fam.equals(other.fam))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (patname == null) {
				if (other.patname != null)
					return false;
			} else if (!patname.equals(other.patname))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return fam + " " + name + " " + patname;
		}
		
		

	}

	

