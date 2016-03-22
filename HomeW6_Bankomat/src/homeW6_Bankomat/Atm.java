package homeW6_Bankomat;


	public class Atm { // Класс банкомат
		
		// Номиналы банкнот
		private final int BANKNOTES1 = 20; // должна быть самого меньшего номинала
		private final int BANKNOTES2 = 50;
		private final int BANKNOTES3 = 100; // должна юыть самого большого номинала
		
		// Количество купюр разного номинала
		private int numberBanknotes1;
		private int numberBanknotes2;
		private int numberBanknotes3;
		

		public int getBanknotes1() {
			
			return BANKNOTES1;
		}

		public int getBanknotes2() {
		
			return BANKNOTES2;
		}

		public int getBanknotes3() {
			
			return BANKNOTES3;
		}
		
		// конструктор без параметров
		public Atm() {
			
			super();
			this.numberBanknotes1 = 0;
			this.numberBanknotes2 = 0;
			this.numberBanknotes3 = 0;
		}
		
		// конструктор с одним параметров
		// задает количество для всех купюр
		public Atm(int numberBanknotes) {
			
			super();
			
			// проверяем если введено не корректно то присваиваем ноль
			if(numberBanknotes > 0) {
				this.numberBanknotes1 = numberBanknotes;
				this.numberBanknotes2 = numberBanknotes;
				this.numberBanknotes3 = numberBanknotes;
			} else {
				this.numberBanknotes1 = 0;
				this.numberBanknotes2 = 0;
				this.numberBanknotes3 = 0;
			}
		}

		// конструктор с треся параметрами для кажлого номинала
		public Atm(int numberBanknotes1, int numberBanknotes2, int numberBanknotes3) {
			super();
			
			// проверяем если введено не корректно то присваиваем ноль
			if(numberBanknotes1 > 0) {
				this.numberBanknotes1 = numberBanknotes1;
			} else {
				this.numberBanknotes1 = 0;
			}
			if(numberBanknotes2 > 0) {
				this.numberBanknotes2 = numberBanknotes2;
			} else {
				this.numberBanknotes2 = 0;
			}
			if(numberBanknotes3 > 0) {
				this.numberBanknotes3 = numberBanknotes3;
			} else {
				this.numberBanknotes3 = 0;
			}
		}

		// методы добавления купюр в банкомат
		public boolean addNumberBanknotes1(int numberBanknotes1) {
			
			if(numberBanknotes1 > 0) {
				
				this.numberBanknotes1 += numberBanknotes1;
				
				return true;
				
			} else {
				
				return false;
			}
		}
		public boolean addNumberBanknotes2(int numberBanknotes2) {
			
			if(numberBanknotes2 > 0) {
				
				this.numberBanknotes2 += numberBanknotes2;
				
				return true;
				
			} else {
				
				return false;
			}
		}
		public boolean addNumberBanknotes3(int numberBanknotes3) {
			
			if(numberBanknotes3 > 0) {
				
				this.numberBanknotes3 += numberBanknotes3;
				
				return true;
				
			} else {
				
				return false;
			}
		}
		
		// методы возвращают количество купюр
		public int getNumberBanknotes1() {
			return numberBanknotes1;
		}
		public int getNumberBanknotes2() {
			return numberBanknotes2;
		}
		public int getNumberBanknotes3() {
			return numberBanknotes3;
		}
		
		// метод возвращает true если полученную сумму можно снять
		// и false если нельзя
		// также печатает количество и номинал выданных купюр
		public boolean checkSum(int sum) {
			
			if(checkPresenceSum(sum) == false) {
				
				return false;
			}
			
			int tempSum = sum;
			
			int[] arrayNumberBanknotes = {0, 0, 0};
			
			int[] arrayNumberBanknotesReal = {numberBanknotes1, numberBanknotes2, numberBanknotes3};
			
			int[] arrBANKNOTES = {BANKNOTES1, BANKNOTES2, BANKNOTES3};
			
			boolean flag = false;
			
			int minBANKNOTES = BANKNOTES1;
			
			int jMinBANKNOTES = 0;
			
			while(tempSum >= minBANKNOTES) {
				
				for (int i = 2; i >= 0; i--) {
					
					if ((flag == true) && (tempSum / arrBANKNOTES[i] > 1) &&
							(arrayNumberBanknotesReal[i] > arrayNumberBanknotes[i])) {
						
						tempSum -= arrBANKNOTES[i];
						
						++arrayNumberBanknotes[i];
						
						flag = false;
						
						break;
						
					} else if ((flag == true) && (arrBANKNOTES[i] == minBANKNOTES) && // 
							(arrayNumberBanknotesReal[i] > arrayNumberBanknotes[i])) {
						
						tempSum -= arrBANKNOTES[i];
						
						++arrayNumberBanknotes[i];
						
						flag = false;
						
						break;
					}
					
					if((flag == false) && (tempSum % arrBANKNOTES[i] == 0) &&
							(arrayNumberBanknotesReal[i] > arrayNumberBanknotes[i])) {
						
						tempSum -= arrBANKNOTES[i];
						
						++arrayNumberBanknotes[i];
						
						flag = false;
						
						break;
					}
					if(i == 0 && flag == false) {
						
						flag = true;
					}
				}
				if(jMinBANKNOTES < 3 && ((arrayNumberBanknotesReal[jMinBANKNOTES] == arrayNumberBanknotes[jMinBANKNOTES]) ||
						(arrayNumberBanknotesReal[jMinBANKNOTES] == 0))) {
					
					++jMinBANKNOTES;
					
					if(jMinBANKNOTES < 3) {
						
						minBANKNOTES = arrBANKNOTES[jMinBANKNOTES];
						
					} else {
						
						break;
					}	
				}
			}
			if(tempSum == 0) {
				
				numberBanknotes1 -= arrayNumberBanknotes[0];
				
				numberBanknotes2 -= arrayNumberBanknotes[1];
				
				numberBanknotes3 -= arrayNumberBanknotes[2];
				
				printBanknotes(arrayNumberBanknotes, arrBANKNOTES);
				
				return true;
				
			} else {
				
				return false;
			}
		}
		
		// метод проверки корректности полученной суммы
		// есть ли в банкомате необходимая сумма
		public boolean checkPresenceSum(int sum) {
			
			int sumBanknotes1 = numberBanknotes1 * BANKNOTES1;
			
			int sumBanknotes2 = numberBanknotes2 * BANKNOTES2;
			
			int sumBanknotes3 = numberBanknotes3 * BANKNOTES3;
			
			if(sum <= (sumBanknotes1 + sumBanknotes2 + sumBanknotes3) && sum >= BANKNOTES1) {
				
				return true;
				
			} else {
				
				return false;
			}
		}
		
		// метод печатает количество и номинал выданных купюр
		private void printBanknotes(int[] arrayNumberBanknotes, int[] arrBANKNOTES) {
			
			for(int i = 0; i < arrayNumberBanknotes.length; i++) {
				
				if(arrayNumberBanknotes[i] != 0) {
					
					System.out.println("ВЫДАНО Кодичество курюр: " + arrayNumberBanknotes[i] + " номиналом: " + arrBANKNOTES[i]);
				}
			}
		}
		
	}

