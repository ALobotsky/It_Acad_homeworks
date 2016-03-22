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
				
				/* ������� ������ � ������� ���� String, � �������������� �������� ���������� ���������.
				 * ��������� ��� �������. ������ ������ ��������� � �������, ������ ����� ���� �����
				 * ������. ���� ���������� �� ����� ����. ������� (��������� ����� ������ ��� �����
				 * �������� ���������� ���������� �������).
				 * ����� ������ ������ ������� � ����� � ������� �� ����� ��� ����� "�".
				 * ����� ������� ������������ ������.
				 *  ���������� ������� ��������� �� ������� ����������� �������.
				 */
				
				List<String> list = new ArrayList<>();
				
				Scanner scanner = new Scanner(System.in);
				
				String str = null;
				
				do {
					
					System.out.println("������� ������ � ������, ��� ���������� ������� 0");
					
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
				
				
				/* ������� ������ � ������� ��������� ���, ������� � ��������. ������ ������� 2 ������� �
				 * ������� ���� ����� ������ (���). � ����� ���������� ������� ���, � ������ �������.
				 * ��������� �� ����������� �������. ��� ������� �������� � HashMap � ������� "man",  "woman"
				 * �������������.
				 * ������ ������������ ������ ������� ��� ������� ��� �� ����� ������� � � ����������� � ����
				 * �������� ����������� �������� �� ������� ������� �������� � HashMap.
				 * �. �. �� ����� ����� ������� ��������� ��� �� �������.
				 */
				
				People[] man = new People[3];
				People[] woman = new People[3];
				
				try {
					
					man[0] = new People("�����", "����", "��������");
					man[1] = new People("���", "��������", "������");
					man[2] = new People("����", "�����", "�������");
					
					woman[0] = new People("��������", "�����", "��������");
					woman[1] = new People("���", "������", "���������");
					woman[2] = new People("����", "�����", "����������");
					
				} catch(ArrayIndexOutOfBoundsException e) {
					
					System.out.println("main_85 ����� �� ������ ������� " + e.getMessage());
				}
				
				
				HashMap<String, People[]> mapPeople = new HashMap<String, People[]>();
				
				final String KEY1 = "man";
				final String KEY2 = "woman";
				
				mapPeople.put(KEY1, man);
				mapPeople.put(KEY2, woman);
				
				// ����� ���������� � ��������� ���
				
				People people = new People();
				
				System.out.print("������� ������� ");
				people.setFam(scanner.nextLine());
				System.out.println();
				
				System.out.print("������� ��� ");
				people.setName(scanner.nextLine());
				System.out.println();
				
				System.out.print("������� �������� ");
				people.setOtch(scanner.nextLine());
				System.out.println();
				
				System.out.print("�������: ");
				System.out.println(people.toString());
				
				// ������� �������������� ��������� ������
				List<String> listKeySet = new ArrayList<>(mapPeople.keySet());
				
				boolean flag = true;
				
				for(String key: listKeySet) {
					
					for(int i = 0; i < (mapPeople.get(key).length); i++) {
						
						if(people.equals(mapPeople.get(key)[i])) {
							
							System.out.print("���� ���������� ");
							System.out.println("���� " + key + " ����� �������� " + i);
							flag = false;
						}
					}
				}
				if(flag) {
					
					System.out.println("��� �����");
				}
				
			
				// ����� ���������� ��� �� ���� ���������
				
				Date date = new Date();
				
				Random random = new Random(date.getTime());
				
				
				int numKey = random.nextInt(mapPeople.size());
				
				int numEl = random.nextInt(mapPeople.get(listKeySet.get(numKey)).length);
				
				try {
					
					System.out.print("������� ��������: ");
					System.out.println(mapPeople.get(listKeySet.get(numKey))[numEl].toString());
					
				} catch(NullPointerException e) {
					
					System.out.println("��� �������� � ������ " + listKeySet.get(numKey) + " � ������� �������� " + numEl);
				}
				
				// ����� ���������� ��� �� ���������� �����
				
				String key;
				
				int i = 0;
				
				do {
					
					System.out.println("�������� ��� � ��� �");
					
					Pattern pattern = Pattern.compile("^[�|�|�|�]$");
					
					String temp = scanner.nextLine();
					
					Matcher matcher = pattern.matcher(temp);
					
					if(matcher.find()) {
						
						key = temp;
						
						break;
					}
				} while(true);
				
				if(key.equals("�") || key.equals("�")) {
					
					key = KEY1;
					
				} else {
					
					key = KEY2;
				}
				try {
					
					System.out.print("������� �������� �� ����� " + key + ": ");
					i = random.nextInt(mapPeople.get(key).length);
					System.out.println(mapPeople.get(key)[i].toString());
					
				} catch(NullPointerException e) {
					
					System.out.println("��� �������� � ������ " + key + " � ������� �������� " + i);
				}
			}
		


	}


