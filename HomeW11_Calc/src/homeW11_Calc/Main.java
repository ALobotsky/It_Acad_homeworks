package homeW11_Calc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		/*
		 * �������� ������� ����������� � �������, ������� ����� ����� ����������,
		 * ��������, �������� � ������ �����, � �������� ���������. ��� �����
		 * ��������������� ����������� � �������������� ����� ����������. �� ������
		 * ������� ��� ������� 2 ���������� - ���� �������� ������� ����� ������
		 * ������������� �����, � ������ ������ ��� ������� + �������� � ���� ����������
		 * ����� getRussianMessage ��� �� ����� ���� �������� �������� ������ ��
		 * �������.*/
		

						Scanner go = new Scanner(System.in);
						double res = (double) 0;
						double res2 = (double) 0;
						String[] toParse = null;
						boolean d = true;
						boolean exit = false;
						do
							{
								do
									{
										System.out.print("\n\n������� �������� �������� ���������� � ����\n<�����1><������>"
												+ "<�����2><������><��������>\n" + "������: 5 18 *\n"
												+ "��� 45.0 3.25 +\n��� n ��� ������");
										String all = go.nextLine();
										all = all.trim();

										toParse = all.split("\\s");
										if (toParse.length == 1 && toParse[0].equalsIgnoreCase("n"))
											{
												exit = true;
												break;
											}
										try
											{
												test(toParse);
											} catch (NotFormattedExeption e)
											{
												System.out.println("Ex1 main () e = " + e.getRussianMessage());
												break;
											}

										try
											{
												res = Double.parseDouble(toParse[0]);
												res2 = Double.parseDouble(toParse[1]);
												switch (toParse[2])
												{
												case "+":
													System.out.printf("��������� ����������: %.1f", res + res2);
													break;
												case "-":
													System.out.printf("��������� ����������: %.1f", res - res2);
													break;
												case "*":
													System.out.printf("��������� ����������: %.1f", res * res2);
													break;
												case "/":
													try
														{
															System.out.printf("��������� ����������: %.1f", delim(res, res2));
														} catch (ToNullExeption e)
														{
															System.out.println("Ex1 main () e = " + e.getRussianMessage());
														}
													break;
												default:
													System.out.println("������� ���������������� �������������� ��������");
												}
												d = true;
											} catch (NumberFormatException e)
											{
												System.out.println("Ex1 main () e = " + e.getMessage());
												d = false;
												System.out.println("��� ������ �� �������� ������");
											}
									} while (d == false);
							} while (exit == false);

					}

				public static void test(String[] string) throws NotFormattedExeption
					{
						if (string.length != 3)
							throw new NotFormattedExeption();

					}

				public static double delim(Double a, Double b) throws ToNullExeption
					{
						if (b == 0)
							throw new ToNullExeption();
						return a / b;
					}

			}


