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
		 
		 //����������� ���� ���������.
		 for(int j = 0; j < patArr.length; j++) {
		 Patient.patientInit(patArr[j]);
        }
		//����� ����� � �������� ������������������ ���������.
		 for(int i = 0; i < patArr.length; i++)
		 patArr[i].printBasePatientData();
		 String surnameSearch;
		 System.out.println("������� ������� ��������, �������� ������ �����:");
		 surnameSearch = scan.findInLine("[a-zA-Z�-��-��ɨ�]+");
		 int ageSearch;
		 System.out.println("������� ������� ��������, �������� ������ �����:");
		 ageSearch = scan.nextInt();
		 System.out.println("����� �� �������:\n\n\n ");
		 //������� ����������
		 int scorer = 0;
		 for(int i = 0; i < patArr.length; i++){
		 if(patArr[i].getSurname().equalsIgnoreCase(surnameSearch)){
		 patArr[i].printAllPatientData();
		 scorer++;
		 }
		 }
		 if(scorer == 0)
		 System.out.println("\n\n�������� � ����� �������� � ���� ���.");
		 else
		 System.out.println("\n\n������� ���������� �� ������� : " + scorer );
		 //����� ��������
		 scorer = 0;
		 System.out.println("����� �� ��������:\n\n\n ");
		 for(int i = 0; i < patArr.length; i++){
		 if(patArr[i].getAge() == ageSearch){
		 patArr[i].printAllPatientData();
		 scorer++;
		 }
		 }
		 if(scorer == 0)
			 System.out.println("\n\n�������� � ����� ��������� � ���� ���.");
			 else
			 System.out.println("\n\n������� ���������� �� �������� : " + scorer );
			 scorer = 0;
			 }
			 }
		 
    
	
	
	

