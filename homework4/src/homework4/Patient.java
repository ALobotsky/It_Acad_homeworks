package homework4;

import java.util.Scanner;

public class Patient {
	
	 static final int M = 1;
	 static final int W = 0;
	 
	
	private String surname;
	private String name;
	private String p_name;
	private String diagnosis;
	private int age;
	private int sex;
	private boolean rezus;
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public boolean isRezus() {
		return rezus;
	}
	public void setRezus(boolean rezus) {
		this.rezus = rezus;
	}
	public static int getM() {
		return M;
	}
	public static int getW() {
		return W;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result
				+ ((diagnosis == null) ? 0 : diagnosis.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((p_name == null) ? 0 : p_name.hashCode());
		result = prime * result + (rezus ? 1231 : 1237);
		result = prime * result + sex;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (age != other.age)
			return false;
		if (diagnosis == null) {
			if (other.diagnosis != null)
				return false;
		} else if (!diagnosis.equals(other.diagnosis))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (p_name == null) {
			if (other.p_name != null)
				return false;
		} else if (!p_name.equals(other.p_name))
			return false;
		if (rezus != other.rezus)
			return false;
		if (sex != other.sex)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	public Patient() {
		super();
		this.surname = surname;
		this.name = name;
		this.p_name = p_name;
		this.diagnosis = diagnosis;
		this.age = age;
		this.sex = sex;
		this.rezus = rezus;
	}
	//the end for results of the work of Source menu
	
	 public void printBasePatientData() {
		 System.out.println("»м€ пациента: " + this.getSurname() + " " + this.getName() +" " + this.getP_name()+ "\n¬озраст пациента: " + this.getAge());
		 }
	 
		 public void printAllPatientData() {
		 System.out.println("\n»м€: " + this.getSurname() +
		 "\n‘амили€: " + this.getName() +
		 "\nќтчество: " + this.getP_name() +
		 "\nƒиагноз: " + this.getDiagnosis() +
		 "\n¬озраст: " + this.getAge() +
		 "\nѕол: " + this.getSex() +
		 "\n–езус-фактор: " + this.isRezus());
		 }
	
		 
		 public boolean isAgeEqual(Patient patient) {
			 if (this.getAge() == patient.getAge())
			 return true;
			 else
			 return false;
			 }
		 // 
			 public boolean isNameEqual(Patient patient) {
			 if (this.getName().equalsIgnoreCase(patient.getName()))
			 return true;
			 else if (this.getSurname().equalsIgnoreCase(patient.getSurname()))
			 return true;
			 else
			 return false;
			 }
			 
			 
			 public static void patientInit(Patient patient) {
			 Scanner scanner = new Scanner(System.in);

	
	
			// Enter Surname & compare
			 System.out.println("\nEnter surname:\n¬вод фамилии:");
			 if (scanner.hasNext("[a-zA-Zа-€ј-яй…®Є]+"))
			 patient.setSurname(scanner.next("[a-zA-Zа-€ј-яй…®Є]+"));
			 else {
			 while (!scanner.hasNext("([a-zA-Zа-€ј-я…й®Є]+)")) {
			 if (scanner.hasNext("[a-zA-Zа-€ј-я®Є…й]+")) {
			 patient.setSurname(scanner.next("[a-zA-Zа-€ј-я®Є…й]+"));
			 break;
			 } else {
			 System.out.println("\nEnter correct surname:\nImpossible reading");
			 scanner.next();
			 }
			 }
			 }
			 
			// Enter name & compare
			 System.out.println("\nEnter patient name :\n¬вод имени пациента :");
			 if (scanner.hasNext("[a-zA-Zа-€ј-яй…®Є]+"))
			 patient.setName(scanner.next("[a-zA-Zа-€ј-яй…®Є]+"));//
			 else {
			 while (!scanner.hasNext("([a-zA-Zа-€ј-яй…Є®]+)")) {
			 if (scanner.hasNext("[a-zA-Zа-€ј-яй…®Є]+")) {
			 patient.setName(scanner.next("[a-zA-Zа-€ј-яй…®Є]+"));
			 break;
			 } else {
			 System.out.println("\nEnter correct name:\n Impossible reading");
			 scanner.next();
			 }
			 }
			 }
			// Enter p_name & compare
			 System.out.println("\nEnter patient p_name :\n¬вод отчества пациента :");
			 if (scanner.hasNext("[a-zA-Zа-€ј-яй…®Є]+"))
			 patient.setP_name(scanner.next("[a-zA-Zа-€ј-яй…®Є]+"));//
			 else {
			 while (!scanner.hasNext("([a-zA-Zа-€ј-яй…Є®]+)")) {
			 if (scanner.hasNext("[a-zA-Zа-€ј-яй…®Є]+")) {
			 patient.setP_name(scanner.next("[a-zA-Zа-€ј-яй…®Є]+"));
			 break;
			 } else {
			 System.out.println("\nEnter correct p_name:\n Impossible reading");
			 scanner.next();
			 }
			 }
			 }
	
			 //Diagnosis 
			 System.out.println("\nEnter diagnosis for the patient:\n:ƒиагноз пациента:");
			
			 if (scanner.hasNextLine())
			 patient.setDiagnosis(scanner.next("[a-zA-Zа-€ј-яЄ®…й]+"));
			 else {
			 while (!scanner.hasNext("([a-zA-Zа-€ј-я®Є…й]+)")) {
			 if (scanner.hasNext("[a-zA-Zа-€ј-я®Є…й]+")) {
			 patient.setDiagnosis(scanner.next("[a-zA-Zа-€ј-я®Є…й]+"));
			 break;
			 } else {
			 System.out.println("\nEnter correct diagnosis:\nImpossible reading");
			 scanner.next();
			 }
			 }
			 }
			//Age 
			 System.out.println("\nEnter age of patient:\n ¬озраст пациента:");
			 if (scanner.hasNextInt())
			 patient.setAge(scanner.nextInt());
			 else {
			 while (!scanner.hasNextInt()) {
			 System.out.println("\nEnter correct age:\n Impossible reading");
			 scanner.next();
			 }
			 patient.setAge(scanner.nextInt());
			 }
			 //Sex 
			 System.out.println("\nEnter sex of patient in next format, write 1- man or 0 - woman :" +
			 "\n¬ведите пол пациента в следующем формате : 1 - мужской, 0 - женский :");
			 if (scanner.nextInt()== 1)
			 patient.setSex(M);
			 else if (scanner.nextInt()== 0)
			 patient.setSex(W);
			 else {
			 while (scanner.nextInt() != 1 || scanner.nextInt() != 0 ) {
			 if (scanner.nextInt()== 1) {
			 patient.setSex(M);
			 break;
			 } else if (scanner.nextInt()== 0) {
			 patient.setSex(W);
			 break;
			 } else {
			 System.out.println("\nEnter correct sex 1 - man or 0 - woman:" +
			 "\n –егистраци€ пола в виде: 1- муж или 0- жен :");
			 }
			 scanner.next();
			 }
			 }
			 scanner.nextLine();
			 System.out.println("\nMark patient rezus \"+\" or \"-\" :\n –езус-фактор + или -:");
			 if (scanner.hasNext("[-]"))
			 patient.setRezus(false);
			 else if (scanner.hasNext("[+]"))
			 patient.setRezus(true);
			 else {
			 while (!scanner.hasNext("[-+]")) {
			 if (scanner.hasNext("[-]")) {
			 patient.setRezus(false);
			 break;
			 } else if (scanner.hasNext("[+]")) {
			 patient.setRezus(true);
			 } else {
			 System.out.println("\nEnter correct rezus mark + or -:" +
			 "\nRezus-factor + или - :");
			 scanner.next();
			 }
			 }
			 }
			 return;
			 }
	
	
	
}
