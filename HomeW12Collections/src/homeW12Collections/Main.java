package homeW12Collections;


		import java.util.ArrayList;
		import java.util.Date;
		import java.util.HashMap;
		import java.util.HashSet;
		import java.util.List;
		import java.util.Random;
		import java.util.Scanner;
		import java.util.regex.Matcher;
		import java.util.regex.Pattern;

		public class Main {

			public static void main(String[] args) {
				
				/* Создать массив с данными типа String, с использованием наиболее подходящей коллекции.
				 * Заполнить его данными. Данные должны вводиться с консоли, массив может быть любой
				 * длинны. Ввод прекрашать по вводу спец. команды (придумать любой символ при вводе
				 * которого прекращаем заполнение массива).
				 * Далее читаем данные массива в цикле и удаляем из строк все буквы "а".
				 * Затем выводим получившийся массив.
				 *  Необходимо удалить дубликаты из массива предыдущего задания.
				 */
				
				List<String> list = new ArrayList<>();
				
				Scanner scanner = new Scanner(System.in);
				
				String str = null;
				
				do {
					
					System.out.println("Введите данные в массив, для завершения введите 0");
					
					str = scanner.nextLine();
					
					if(!str.equals("0")) {
						
						list.add(str);
					}
					
				} while(!str.equals("0"));
				
				for(int i = 0; i < list.size(); i++ ) {
					
					list.set(i, list.get(i).replaceAll("a", ""));
				}
				
				System.out.println(list.toString());
				
				HashSet<String> hashSet = new HashSet<String>(list);
				
				list.clear();
				
				list.addAll(hashSet);
				
				System.out.println(list.toString());
				
				
				/* Создать объект в котором храниться имя, фамилия и отчество. Дальше создать 2 массива с
				 * данными типа этого обекта (ФИО). В одном содержатся мужские ФИО, в другом женские.
				 * Заполнить их подходящими данными. Все массивы записать в HashMap с ключами "man",  "woman"
				 * соответсвенно.
				 * Дальше пользователь вводит мужское или женское ФИО он хочет вывести и в соответсвии с этим
				 * рандомно вытаскиваем значения из массива который хранится в HashMap.
				 * Т. е. на экран дожно вывести рандомное ФИО из массива.
				 */
				
				People[] man = new People[3];
				People[] woman = new People[3];
				
				try {
					
					man[0] = new People("Угорь", "Иван", "Иванович");
					man[1] = new People("Сом", "Мафусаил", "Янович");
					man[2] = new People("Карп", "Алесь", "Ляхович");
					
					woman[0] = new People("Скардино", "Ирина", "Олеговеа");
					woman[1] = new People("Сом", "Марина", "Антоновна");
					woman[2] = new People("Мышь", "Злата", "Бедросовна");
					
				} catch(ArrayIndexOutOfBoundsException e) {
					
					System.out.println("main_85 выход за предел массива " + e.getMessage());
				}
				
				
				HashMap<String, People[]> mapPeople = new HashMap<String, People[]>();
				
				final String KEY1 = "man";
				final String KEY2 = "woman";
				
				mapPeople.put(KEY1, man);
				mapPeople.put(KEY2, woman);
				
				// Вывод совпадения с введенным ФИО
				
				People people = new People();
				
				System.out.print("Введите фамилию ");
				people.setFam(scanner.nextLine());
				System.out.println();
				
				System.out.print("Введите имя ");
				people.setName(scanner.nextLine());
				System.out.println();
				
				System.out.print("Введите отчество ");
				people.setOtch(scanner.nextLine());
				System.out.println();
				
				System.out.print("Введено: ");
				System.out.println(people.toString());
				
				// Создаем доролнительную коллекцию ключей
				List<String> listKeySet = new ArrayList<>(mapPeople.keySet());
				
				boolean flag = true;
				
				for(String key: listKeySet) {
					
					for(int i = 0; i < (mapPeople.get(key).length); i++) {
						
						if(people.equals(mapPeople.get(key)[i])) {
							
							System.out.print("Есть совпадение ");
							System.out.println("ключ " + key + " номер элемента " + i);
							flag = false;
						}
					}
				}
				if(flag) {
					
					System.out.println("Нет таких");
				}
				
			
				// Вывод случайного ФИО из всей коллекции
				
				Date date = new Date();
				
				Random random = new Random(date.getTime());
				
				
				int numKey = random.nextInt(mapPeople.size());
				
				int numEl = random.nextInt(mapPeople.get(listKeySet.get(numKey)).length);
				
				try {
					
					System.out.print("Выбрано случайно: ");
					System.out.println(mapPeople.get(listKeySet.get(numKey))[numEl].toString());
					
				} catch(NullPointerException e) {
					
					System.out.println("нет элемента с ключем " + listKeySet.get(numKey) + " с номером элемента " + numEl);
				}
				
				// вывод случайного ФИО по выбранному ключу
				
				String key;
				
				int i = 0;
				
				do {
					
					System.out.println("Выберите пол М или Ж");
					
					Pattern pattern = Pattern.compile("^[М|м|Ж|ж]$");
					
					String temp = scanner.nextLine();
					
					Matcher matcher = pattern.matcher(temp);
					
					if(matcher.find()) {
						
						key = temp;
						
						break;
					}
				} while(true);
				
				if(key.equals("М") || key.equals("м")) {
					
					key = KEY1;
					
				} else {
					
					key = KEY2;
				}
				try {
					
					System.out.print("Выбрано случайно из ключа " + key + ": ");
					i = random.nextInt(mapPeople.get(key).length);
					System.out.println(mapPeople.get(key)[i].toString());
					
				} catch(NullPointerException e) {
					
					System.out.println("нет элемента с ключем " + key + " с номером элемента " + i);
				}
			}
		


	}


