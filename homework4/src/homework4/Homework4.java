package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		
		 java.util.Scanner scan = new java.util.Scanner(System.in) ;
		 int numberOfPatients = 3;
		 
		 
		 
		 Patient[] patArr = new Patient[numberOfPatients];
		 for(int i = 0; i < numberOfPatients; i++)
			 
		 patArr[i] = new Patient();
		 
		 //Регистрация всех пациентов.
		 for(int j = 0; j < patArr.length; j++) {
		 Patient.patientInit(patArr[j]);
        }
		//Вывод имени и возраста зарегестрированных пациентов.
		 for(int i = 0; i < patArr.length; i++)
		 patArr[i].printBasePatientData();
		 String surnameSearch;
		 System.out.println("Введите фамилию пациента, которого хотите найти:");
		 surnameSearch = scan.findInLine("[a-zA-Zа-яА-ЯйЙЁё]+");
		 int ageSearch;
		 System.out.println("Введите возраст пациента, которого хотите найти:");
		 ageSearch = scan.nextInt();
		 System.out.println("Поиск по фамилии:\n\n\n ");
		 //Счётчик совпадений
		 int scorer = 0;
		 for(int i = 0; i < patArr.length; i++){
		 if(patArr[i].getSurname().equalsIgnoreCase(surnameSearch)){
		 patArr[i].printAllPatientData();
		 scorer++;
		 }
		 }
		 if(scorer == 0)
		 System.out.println("\n\nПациента с такой фамилией в базе нет.");
		 else
		 System.out.println("\n\nНайдено совпадений по фамилии : " + scorer );
		 //Откат счетчика
		 scorer = 0;
		 System.out.println("Поиск по возрасту:\n\n\n ");
		 for(int i = 0; i < patArr.length; i++){
		 if(patArr[i].getAge() == ageSearch){
		 patArr[i].printAllPatientData();
		 scorer++;
		 }
		 }
		 if(scorer == 0)
			 System.out.println("\n\nПациента с таким возрастом в базе нет.");
			 else
			 System.out.println("\n\nНайдено совпадений по возрасту : " + scorer );
			 scorer = 0;
			 }
			 }
		 
    
	
	
	

