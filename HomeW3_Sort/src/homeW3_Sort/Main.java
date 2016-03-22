package homeW3_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		        int[] ar = new int[10];

		     // standart expressions
		        
		        initArray(ar); 

		        showArray(ar);

		        bubbleSort(ar);

		        showArray(ar);

		        randomInit(ar);

		        showArray(ar);

		        selectionSort(ar);

		        showArray(ar);

		        randomInit(ar);

		        showArray(ar);

		        Arrays.sort(ar);

		        showArray(ar);

		        showEven(ar);


		    }
		    /*Initialises your array */
		    public static void initArray(int[] array){
		        Scanner scanner = new Scanner(System.in);
		        for (int i = 0; i < array.length ; i++) {
		            System.out.println("Enter elment of array with index " + i + " :");
		            if(scanner.hasNextInt())
		                array[i] = scanner.nextInt();
		            else {
		                System.out.println("Wrong data!");
		                // For initialisation of all data array.
		                i--;
		            }

		        }
		    }
		    /*Show all array's elements.*/
		    public static void showArray(int[] array){
		        for (int i = 0; i < array.length ; i++) {
		            System.out.print("|" + array[i] );

		        }
		        System.out.println();
		    }
		    public static void bubbleSort(int[] array){
		        for(int i = array.length - 1 ; i > 0; i--){
		            for(int j = 0; j < i ;j++){
		                int t;
		                if (array[j] > array[j+1]) {
		                 t = array[j+1];
		                 array[j+1] = array[j];
		                 array[j] = t;
		                }
		            }
		        }

		    }
		    public static void selectionSort(int[] array){ 
		        for(int i = 0; i < array.length; i++){
		            for (int j = i + 1 ; j < array.length; j++) {
		                int t;
		                if(array[j] < array[i]){
		                    t = array[j];
		                    array[j] = array[i];
		                    array[i] = t;
		                }

		            }
		        }
		    }
		    /*Show all even nubers in array*/
		    public static void showEven(int[] array){
		        System.out.println("Even numbers in array is : ");
		        for (int i = 0; i <array.length ; i++) {

		            if ((array[i]%2 == 0)&&(array[i]!=0))
		                System.out.print("|" + array[i] );

		        }
		    }
		    /*Random array initialization*/
		    public static void randomInit(int[] array){
		       // java.util.Random random = new java.util.Random() ;
		        for (int i = 0; i < array.length ; i++) {
		            array[i] =(int)(Math.random()*100);

		        }
		    }
		


	}


