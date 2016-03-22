package homework9_date;

//import by.tut.alexey_zubkovskiy.HomeWork.filework.FileWorking;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Scanner;
		
		public class Main {

		    public static void main(String[] args) throws IOException {

       
        int n =1;
        
		        Student[] students = new Student[1];

		        for (int i = 0; i < n; i++) {
		            students[i] = Student.createStudent();
		        }

		   
		        
		        int years = (int) (Student.getAverageAgeMillis(students) / 31536000000L);
		        // в году 31536000000

		        int months = (int) ((Student.getAverageAgeMillis(students) % 31536000000L) / 2592000000L);
		        //в мес€це 2592000000 
		        System.out.println("—редний возраст ваших " + students.length + " студентов: " +
		                years + " лет," + months + " мес€цев.");
		

	}

}
