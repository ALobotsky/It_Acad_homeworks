package homework2;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Создайте массив с 10-ю переменными типа int. Используя оператор "for"
		 * найдите и выведите на экран наименьшее и наибольшее значение в
		 * массиве. min value = "значение которое у вас получилось". max value =
		 * "значение которое у вас получилось". Далее замените наименьшее
		 * значение на 0, а наибольшее значение на 99 и выведите получившийся
		 * массив на экран в виде: [23, 0, 34, 99, 43534].
		 */
		System.out.println("N1");
		int[] ten = { 5, 6, -3, 7, 5, 333, 44, 6, 7, 11 };
		int max = ten[0];
		int nMa = 0;
		int min = ten[1];
		int nMi = 0;
		for (int i = 0; i < ten.length; i++) {
			if (max < ten[i]) { max = ten[i]; nMa = i; } 
			if (min > ten[i]) { min = ten[i]; nMi = i;}
		}
		System.out.println("min value =" + min);
		System.out.println("max value =" + max);
		ten[nMa] = 99;
		ten[nMi] = 0;
		for (int i = 0; i < ten.length; i++) {
			System.out.print(ten[i] + "; ");
		}
		System.out.println();
		/*
		 * Создайте массив с 10-ю переменными типа float. Далее найдите
		 * дубликаты и выведите их количество. Пример: есть массив {2, 3, 5, 7,
		 * 6, 5, 7, 3, 7, 20} - в данном массиве цифра 3 и 7 повторяются. В
		 * результате выполнения программы на экран должно вывести: [3] -
		 * повторений 2 [7] - повторений 3
		 */
		System.out.println("N2");
		 int l=1;
		boolean numb=false; // контроль повторов при печати
		float[] dub= { 2, 5, 7, 5, 5, 7, 7, 2, 7, 7 };
		for (int i = 0; i < (dub.length-1); i++) {
			 l=1;//счетчик
			 for (int j = i - 1; j >= 0; j--) {
				 if (dub[i]==dub[j]) {
				 numb=true;
				 }
				 }
				 if (numb==true) {
				 continue;
				 }
				 //Подсчёт повторяющихся элементов dub
				 for (int g = i + 1; g < dub.length; g++) {
				 if (dub[i] == dub[g]) {
				 l=l+1;
				 }
				 }
				 if (l > 1) {
				 System.out.println("[" +  dub[i] + "]-" + " повторений " + l);
				 }
				 }
		
				
		/*
		 * Напишите программу, которая печатает массив, затем инвертирует
		 *  (то есть меняет местами первый элемент с последним,
		 *  второй — с предпоследним и т.д.), и вновь печатает.
		 */
		System.out.println("N3");
		
		int[] mass = { 1, 2, 3, 4, 5, 6, 9, 11 };
		int[] Imass=new int[mass.length]; //инвертированный массив
		for (int q = 0; q < mass.length; q++) {
			System.out.print(mass[q]+"; ");//вывод исходного
		} System.out.println();
		int w;
		for (int q = mass.length-1; q!=-1; q--) {
		for ( w = 0; w < mass.length-1; w++);//заnолнение инвертированного массива 
			Imass[w] = mass[q];
			System.out.print(Imass[w]+"; ");
			
		}
		
	
		}

	}


