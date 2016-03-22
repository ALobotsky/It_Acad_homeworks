package homeW6_Bankomat;



		import java.util.Scanner;

		public class Main {

			public static void main(String[] args) {
				
				
				/*
				 * ������� ����� � ������� ����������� ��������. ����� ����� ����������� � ���������
				 * ������ ���������� ����� ����������: ����������� ����� ��������� 20 50 100. �������
				 * ������ ��� ���������� ����� � ��������. ������� ������� ��������� ������. �� ����
				 * ���������� ����� �����. �� ����� � ��������� �������� (�������� ������� ��� ���). ���
				 * ������ ����� ������� ������ ������������ ����� ����������� ����� ������ ��������
				 * �������� �����. ������� ����������� � ����� ����������� � ����������� �����. ������ � ��
				 * ���� ����������.
				 */
				
				
				Atm atm = new Atm();
				
				// ����������� ���������� ���������� �����
				final int MIN_ADD_BANKNOTES = 1;
				
				// ������������ ���������� ���������� �����
				final int MAX_ADD_BANKNOTES = 100;
				
				int ch = 9;
				
				do {
					
					int maxSize = menu1min0();
					
					ch = choise(0, maxSize);
					
					switch(ch) {
					
					case 1:
						
						System.out.println("����� �������");
						
						if(atm.getNumberBanknotes1() != 0 ||
								atm.getNumberBanknotes2() != 0 ||
								atm.getNumberBanknotes3() != 0) {
							
							System.out.print("��������� ������: ");
							
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
						
							System.out.println("������� ��������� �����");
						
							int sum = choise(1, 100000000);
						
							if(atm.checkSum(sum)) {
							
								System.out.println("�������� ������� ���������");
								
							} else if(!atm.checkPresenceSum(sum)) {
								
								System.out.println("������������ ������� � ���������");
								
							} else {
								
								System.out.println("������� ������������ �����");
							}
						
						} else {
							
							System.out.println("�������� � ��������� ��� �����");
						}
						
						break;
						
					case 2:
						
						System.out.println("������� ����� � ���������:");
						
						System.out.println("������� " + atm.getBanknotes1() + " - " + atm.getNumberBanknotes1() + " ��");
						
						System.out.println("������� " + atm.getBanknotes2() + " - " + atm.getNumberBanknotes2() + " ��");
						
						System.out.println("������� " + atm.getBanknotes3() + " - " + atm.getNumberBanknotes3() + " ��");
						
						break;
						
					case 3:
						
						System.out.println("���������� �����");
						
						int maxSize2 = menu2min0(atm.getBanknotes1(), atm.getBanknotes2(), atm.getBanknotes3());
						
						int ch2 = choise(0, maxSize2);
						
						if(ch2 != 0) {
							
							int kol = choise(MIN_ADD_BANKNOTES, MAX_ADD_BANKNOTES);
							
							if(ch2 == 1 && atm.addNumberBanknotes1(kol)) {
								
								System.out.print("���������� ����� ��������� " + atm.getBanknotes1() + " ");
								
								System.out.println("����������� �� " + kol);
							}
							if(ch2 == 2 && atm.addNumberBanknotes2(kol)) {
								
								System.out.print("���������� ����� ��������� " + atm.getBanknotes2() + " ");
								
								System.out.println("����������� �� " + kol);
							}
							if(ch2 == 3 && atm.addNumberBanknotes3(kol)) {
								
								System.out.print("���������� ����� ��������� " + atm.getBanknotes3() + " ");
								
								System.out.println("����������� �� " + kol);
							}
						}
						
						break;
					}
				} while(ch != 0);
				
				System.out.println("GOOD BYE");
			}
			
			// ��������� ����
			public static int menu1min0 () {
			
				final int MAX = 3;
			
				System.out.println("1 - ����� ��������");
			
				System.out.println("2 - �������� ���������� ���������� �����");
			
				System.out.println("3 - ���������� �����");
			
				System.out.println("0 - �����");
			
				return MAX;
			}
			
			// ���� ���������� �����
			public static int menu2min0 (int banknote1, int banknote2, int banknote3) {
				
				final int MAX = 3;
			
				System.out.println("1 - �������� ������ ��������� " + banknote1);
			
				System.out.println("2 - �������� ������ ��������� " + banknote2);
			
				System.out.println("3 - �������� ������ ��������� " + banknote3);
			
				System.out.println("0 - �����");
			
				return MAX;
			}
			
			// ����� ���������� ���������� ���� � ����������
			// ������ ����� �� from �� to � ���������� ��������� �����
			public static int choise(int from, int to) {
					
				boolean flag = true;
					
				int choise = 0;
					
				do {
						
					System.out.print("������� �� " + from + " �� " + to + " ");
					
					Scanner scanner = new Scanner (System.in);
					
					if(scanner.hasNextInt()) {
						
						choise = scanner.nextInt();
					
						System.out.println();
							
						flag = false;
						
					} else {
					
						System.out.println("������� ��� �� �� ��, ���������� ��� ���");
							
						flag = true;
							
					}
						
					if(flag == false && (choise > to || choise < from)) {
							
						System.out.println("������� ��� �� �� ��, ���������� ��� ���");
							
						flag = true;
							
					}
					
				} while(flag);
					
				return choise;
			}
			
		}

