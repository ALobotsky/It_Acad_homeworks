package homeW6_Bankomat;



		import java.util.Scanner;

		public class Main {

			public static void main(String[] args) {
				
				
				/*
				 * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате
				 * должен задаваться тремя свойствами: количеством купюр номиналом 20 50 100. Сделать
				 * методы для добавления денег в банкомат. Сделать функцию снимающую деньги. На вход
				 * передается сумма денег. На выход – булевское значение (операция удалась или нет). При
				 * снятии денег функция должна рапечатывать каким количеством купюр какого номинала
				 * выдается сумма. Создать конструктор с тремя параметрами – количеством купюр. Прочее – на
				 * ваше усмотрение.
				 */
				
				
				Atm atm = new Atm();
				
				// минимальное количество добавления купюр
				final int MIN_ADD_BANKNOTES = 1;
				
				// максимальное количество добавления купюр
				final int MAX_ADD_BANKNOTES = 100;
				
				int ch = 9;
				
				do {
					
					int maxSize = menu1min0();
					
					ch = choise(0, maxSize);
					
					switch(ch) {
					
					case 1:
						
						System.out.println("ВЫВОД СРЕДСТВ");
						
						if(atm.getNumberBanknotes1() != 0 ||
								atm.getNumberBanknotes2() != 0 ||
								atm.getNumberBanknotes3() != 0) {
							
							System.out.print("Доступные купюры: ");
							
							if(atm.getNumberBanknotes1() != 0) {
								
								System.out.print(atm.getBanknotes1() + " ");
							}
							if(atm.getNumberBanknotes2() != 0) {
								
								System.out.print(atm.getBanknotes2() + " ");
							}
							if(atm.getNumberBanknotes3() != 0) {
			
								System.out.print(atm.getBanknotes3());
							}
							System.out.println();
						
							System.out.println("Введите требуемую сумму");
						
							int sum = choise(1, 100000000);
						
							if(atm.checkSum(sum)) {
							
								System.out.println("Операция успешно завершена");
								
							} else if(!atm.checkPresenceSum(sum)) {
								
								System.out.println("Недостаточно средств в банкомате");
								
							} else {
								
								System.out.println("Введена некорректная сумма");
							}
						
						} else {
							
							System.out.println("Извините в банкомате нет купюр");
						}
						
						break;
						
					case 2:
						
						System.out.println("НАЛИЧИЕ КУПЮР В БАНКОМАТЕ:");
						
						System.out.println("номинал " + atm.getBanknotes1() + " - " + atm.getNumberBanknotes1() + " шт");
						
						System.out.println("номинал " + atm.getBanknotes2() + " - " + atm.getNumberBanknotes2() + " шт");
						
						System.out.println("номинал " + atm.getBanknotes3() + " - " + atm.getNumberBanknotes3() + " шт");
						
						break;
						
					case 3:
						
						System.out.println("ДОБАВЛЕНИЕ КУПЮР");
						
						int maxSize2 = menu2min0(atm.getBanknotes1(), atm.getBanknotes2(), atm.getBanknotes3());
						
						int ch2 = choise(0, maxSize2);
						
						if(ch2 != 0) {
							
							int kol = choise(MIN_ADD_BANKNOTES, MAX_ADD_BANKNOTES);
							
							if(ch2 == 1 && atm.addNumberBanknotes1(kol)) {
								
								System.out.print("Количество купюр номиеалом " + atm.getBanknotes1() + " ");
								
								System.out.println("увеличилось на " + kol);
							}
							if(ch2 == 2 && atm.addNumberBanknotes2(kol)) {
								
								System.out.print("Количество купюр номиеалом " + atm.getBanknotes2() + " ");
								
								System.out.println("увеличилось на " + kol);
							}
							if(ch2 == 3 && atm.addNumberBanknotes3(kol)) {
								
								System.out.print("Количество купюр номиеалом " + atm.getBanknotes3() + " ");
								
								System.out.println("увеличилось на " + kol);
							}
						}
						
						break;
					}
				} while(ch != 0);
				
				System.out.println("GOOD BYE");
			}
			
			// начальное меню
			public static int menu1min0 () {
			
				final int MAX = 3;
			
				System.out.println("1 - Снять наличные");
			
				System.out.println("2 - Просмотр количества оставшихся купюр");
			
				System.out.println("3 - Добавление купюр");
			
				System.out.println("0 - Выход");
			
				return MAX;
			}
			
			// меню добавления купюр
			public static int menu2min0 (int banknote1, int banknote2, int banknote3) {
				
				final int MAX = 3;
			
				System.out.println("1 - Добавить купюры номиналом " + banknote1);
			
				System.out.println("2 - Добавить купюры номиналом " + banknote2);
			
				System.out.println("3 - Добавить купюры номиналом " + banknote3);
			
				System.out.println("0 - Выход");
			
				return MAX;
			}
			
			// Метод производит корректный ввод с клавиатуры
			// целого числа от from до to и возвращает выбранное число
			public static int choise(int from, int to) {
					
				boolean flag = true;
					
				int choise = 0;
					
				do {
						
					System.out.print("Введите от " + from + " до " + to + " ");
					
					Scanner scanner = new Scanner (System.in);
					
					if(scanner.hasNextInt()) {
						
						choise = scanner.nextInt();
					
						System.out.println();
							
						flag = false;
						
					} else {
					
						System.out.println("Введено что то не то, попробуйте еще раз");
							
						flag = true;
							
					}
						
					if(flag == false && (choise > to || choise < from)) {
							
						System.out.println("Введено что то не то, попробуйте еще раз");
							
						flag = true;
							
					}
					
				} while(flag);
					
				return choise;
			}
			
		}

