package homework1;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Создайте переменную типа String c любым текстом (не сильно короткое).
		 * Далее выведите на экран количество символов в данной строке. Далее
		 * разделите строку пополам (если ровно поделить не выходит то +-1 не
		 * страшно), в результате у вас должно быть 2-е новых переменных типа
		 * String с частями из изначальной строки. Полученные строки выведите на
		 * экран.
		 */

		System.out.println("N1");
		String text = "Si vie pasem - para bellum";
		int lng = text.length();
		System.out.println(lng);// символы посчитаны
		String text1 = text.substring(0, (lng / 2)); // выделили части строк
		String text2 = text.substring((lng / 2 + 1), lng);// методом
															// substring(int
															// begin,int end)

		System.out.println(text1);
		System.out.println(text2);
		/*
		 * Создайте любое число. Определите, является ли последняя цифра числа
		 * семеркой.
		 */
		System.out.println("N2");
		int t7 = 1417;
		int re;
		re = (t7 % 10) - 7;// определяем через остаток от целочисленного деления
							// (можно было /7 и пр.)
		if (re == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		/*
		 * Имеется прямоугольное отверстие размерами a и b (размеры задать
		 * любые), определить, можно ли его полностью закрыть круглой картонкой
		 * радиусом r (тоже подставляем любое значение).
		 */
		System.out.println("N3");
		int a = 4;
		int b = 7;
		int r = 6;
		if (Math.hypot(a, b) <= 2 * r) { // диагональ прямоугольника сравниваем
											// с диаметром
			System.out.println("hole is close");
		} else {
			System.out.println("hole is open");
		}
		/*
		 * Имеется целое число (любое), это число — сумма денег в рублях.
		 * Вывести это число, добавив к нему слово «рублей» в правильном падеже.
		 */
		System.out.println("N4");
		int lik = 1791;
		switch (lik % 10) {
		case 1:
			System.out.println("рубль");//..1 рубль
			break;
		case 2:
			System.out.println("рубля");
			break;
		case 3:
			System.out.println("рубля");
			break;
		case 4:
			System.out.println("рубля");
			break;
		default:
			System.out.println("рублей");// оканчивается от 5 до 9 и 0
		}
		/*
		 * Имеется строка, которая содержит символы ? и символы #. Замените все
		 * символы ? на HELLO, а # - удалите. Результат вывести на экран.
		 */
		System.out.println("N5");
		String str = "shall ? i go#to #?hell?";
		str = str.replace("?", "HELLO");// заменили "?" на "HELLO"
		str = str.replace("#", "");// аналогично, "#" - на пустое поле
		System.out.println(str);// вывели результат

		/*
		 * Доп пример из ДЗ
		 */
		System.out.println("Additional Task");
		double t = 1;
		double x = 1;
		double s = 3;
		double y = (Math.pow(Math.sin(Math.pow(x, t)),2) 
				/ (Math.sqrt(1 + (Math.pow(x, s)))));
		System.out.println(y);//
	}
}
