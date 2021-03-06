package homeW14_json;

public class People {

		
		private int age;
		private long id;
		private boolean isDegree;
		private String name;
		private String surname;
		
		
		
		
		public People() {
		}

		public People(int age, long id, boolean isDegree, String name, String surname) {
			this.age = age;
			this.id = id;
			this.isDegree = isDegree;
			this.name = name;
			this.surname = surname;
		}


		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}

		public boolean getIsDegree() {
			return isDegree;
		}
		public void setIsDegree(boolean isDegree) {
			this.isDegree = isDegree;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + (int) (id ^ (id >>> 32));
			result = prime * result + (isDegree ? 1231 : 1237);
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
			if (age != other.age)
				return false;
			if (id != other.id)
				return false;
			if (isDegree != other.isDegree)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (surname == null) {
				if (other.surname != null)
					return false;
			} else if (!surname.equals(other.surname))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Element [age=" + age + ", id=" + id + ", isDegree=" + isDegree + ", name=" + name + ", surname="
					+ surname + "]";
		}
		
		

	}


