package homework2;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� ������ � 10-� ����������� ���� int. ��������� �������� "for"
		 * ������� � �������� �� ����� ���������� � ���������� �������� �
		 * �������. min value = "�������� ������� � ��� ����������". max value =
		 * "�������� ������� � ��� ����������". ����� �������� ����������
		 * �������� �� 0, � ���������� �������� �� 99 � �������� ������������
		 * ������ �� ����� � ����: [23, 0, 34, 99, 43534].
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
		 * �������� ������ � 10-� ����������� ���� float. ����� �������
		 * ��������� � �������� �� ����������. ������: ���� ������ {2, 3, 5, 7,
		 * 6, 5, 7, 3, 7, 20} - � ������ ������� ����� 3 � 7 �����������. �
		 * ���������� ���������� ��������� �� ����� ������ �������: [3] -
		 * ���������� 2 [7] - ���������� 3
		 */
		System.out.println("N2");
		 int l=1;
		boolean numb=false; // �������� �������� ��� ������
		float[] dub= { 2, 5, 7, 5, 5, 7, 7, 2, 7, 7 };
		for (int i = 0; i < (dub.length-1); i++) {
			 l=1;//�������
			 for (int j = i - 1; j >= 0; j--) {
				 if (dub[i]==dub[j]) {
				 numb=true;
				 }
				 }
				 if (numb==true) {
				 continue;
				 }
				 //������� ������������� ��������� dub
				 for (int g = i + 1; g < dub.length; g++) {
				 if (dub[i] == dub[g]) {
				 l=l+1;
				 }
				 }
				 if (l > 1) {
				 System.out.println("[" +  dub[i] + "]-" + " ���������� " + l);
				 }
				 }
		
				
		/*
		 * �������� ���������, ������� �������� ������, ����� �����������
		 *  (�� ���� ������ ������� ������ ������� � ���������,
		 *  ������ � � ������������� � �.�.), � ����� ��������.
		 */
		System.out.println("N3");
		
		int[] mass = { 1, 2, 3, 4, 5, 6, 9, 11 };
		int[] Imass=new int[mass.length]; //��������������� ������
		for (int q = 0; q < mass.length; q++) {
			System.out.print(mass[q]+"; ");//����� ���������
		} System.out.println();
		int w;
		for (int q = mass.length-1; q!=-1; q--) {
		for ( w = 0; w < mass.length-1; w++);//��n������� ���������������� ������� 
			Imass[w] = mass[q];
			System.out.print(Imass[w]+"; ");
			
		}
		
	
		}

	}


