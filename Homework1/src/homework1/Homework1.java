package homework1;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� ���������� ���� String c ����� ������� (�� ������ ��������).
		 * ����� �������� �� ����� ���������� �������� � ������ ������. �����
		 * ��������� ������ ������� (���� ����� �������� �� ������� �� +-1 ��
		 * �������), � ���������� � ��� ������ ���� 2-� ����� ���������� ����
		 * String � ������� �� ����������� ������. ���������� ������ �������� ��
		 * �����.
		 */

		System.out.println("N1");
		String text = "Si vie pasem - para bellum";
		int lng = text.length();
		System.out.println(lng);// ������� ���������
		String text1 = text.substring(0, (lng / 2)); // �������� ����� �����
		String text2 = text.substring((lng / 2 + 1), lng);// �������
															// substring(int
															// begin,int end)

		System.out.println(text1);
		System.out.println(text2);
		/*
		 * �������� ����� �����. ����������, �������� �� ��������� ����� �����
		 * ��������.
		 */
		System.out.println("N2");
		int t7 = 1417;
		int re;
		re = (t7 % 10) - 7;// ���������� ����� ������� �� �������������� �������
							// (����� ���� /7 � ��.)
		if (re == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		/*
		 * ������� ������������� ��������� ��������� a � b (������� ������
		 * �����), ����������, ����� �� ��� ��������� ������� ������� ���������
		 * �������� r (���� ����������� ����� ��������).
		 */
		System.out.println("N3");
		int a = 4;
		int b = 7;
		int r = 6;
		if (Math.hypot(a, b) <= 2 * r) { // ��������� �������������� ����������
											// � ���������
			System.out.println("hole is close");
		} else {
			System.out.println("hole is open");
		}
		/*
		 * ������� ����� ����� (�����), ��� ����� � ����� ����� � ������.
		 * ������� ��� �����, ������� � ���� ����� ������� � ���������� ������.
		 */
		System.out.println("N4");
		int lik = 1791;
		switch (lik % 10) {
		case 1:
			System.out.println("�����");//..1 �����
			break;
		case 2:
			System.out.println("�����");
			break;
		case 3:
			System.out.println("�����");
			break;
		case 4:
			System.out.println("�����");
			break;
		default:
			System.out.println("������");// ������������ �� 5 �� 9 � 0
		}
		/*
		 * ������� ������, ������� �������� ������� ? � ������� #. �������� ���
		 * ������� ? �� HELLO, � # - �������. ��������� ������� �� �����.
		 */
		System.out.println("N5");
		String str = "shall ? i go#to #?hell?";
		str = str.replace("?", "HELLO");// �������� "?" �� "HELLO"
		str = str.replace("#", "");// ����������, "#" - �� ������ ����
		System.out.println(str);// ������ ���������

		/*
		 * ��� ������ �� ��
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
