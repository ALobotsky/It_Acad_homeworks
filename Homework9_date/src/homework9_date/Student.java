package homework9_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Student {

	    private Student(String name, String surname, String birthDateddMMyyyy) {

	        this.name = name.trim();

	        this.surname = surname.trim();

	        try {
	            this.birthDate = format.parse(birthDateddMMyyyy.trim());
	        } catch (ParseException e) {
	            System.out.println("�� ������� ���������������� �������� ���-�� ������������� ������� ���� ��������.");

	        }

	    }
	    
	     // �������� ������ ������� 
	     // ���� � �������. 
	    
	    public static Student createStudent() {

	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("������� ��� �������� :\t ");

	        String name = scanner.nextLine();

	        System.out.println("������� ������� �������� :\t ");

	        String surname = scanner.nextLine();

	        String birthDate;

	        Student student = null;

	        //���� � �����. �������
	        do {
	            System.out.println("������� ���� �������� � ������� dd.MM.yyyy :\t ");

	            if (scanner.hasNext("[0-3][0-9]\\.[01][0-9]\\.[12][09][0-9][0-9]")) {
	                birthDate = scanner.next("[0-3][0-9]\\.[01][0-9]\\.[12][09][0-9][0-9]");
	                student = new Student(name, surname, birthDate);
	            } else {
	                System.out.println("������� ���� ���������!");
	                birthDate = scanner.next();
	            }
	        } while (student == null);


	        return student;
	    }

	    public static long getAverageAgeMillis(Student[] students) {
	        long average = 0;

	        Date currentDate = new Date();
	      
	        for (int i = 0; i < students.length; i++) {
	            if (i < students.length - 1) {

	              
	                average +=students[i].getBirthDate().getTime();
	            } else {
	               

	                average = average + students[i].getBirthDate().getTime();                                                                 //(average + cal.getTimeInMillis()) / students.length;
	            }


	        }
	        return currentDate.getTime() - average;
	    }

	    private static SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

	    private String name;

	    private String surname;

	    private Date birthDate;

	    public String getName() {
	        return name;
	    }

	    public String getSurname() {
	        return surname;
	    }

	    @Override
	    public String toString() {
	        return "�������:\n" +
	                "���: " + name +
	                "\n�������: " + surname +
	                "\n���� ��������: " + birthDate;
	    }

	    public Date getBirthDate() {
	        return birthDate;
	    }
	}

	
