package homeW16_Threads_;

import java.util.Scanner;

public class HomeW16_Threads_ extends Thread {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Digital d1 = new Digital("1");
		Digital d2 = new Digital("2");
		while (true) {
			System.out.println("Please, to write \"start\" for runnings: ");
			if (scanner.nextLine().equalsIgnoreCase("start")) {
				d1.start();
				d2.start();
				break;
			} else
				continue;
		}
	}

	public static 
	synchronized // p.3 of hometask;
	void print10() {

		Thread.currentThread().setName(
				"Thread: " + (int) (Math.random() * 10) + " ");
		for (int i = 1; i <= 100;) {
			StringBuffer stb = new StringBuffer("");
			stb.append(Thread.currentThread().getName() + "\t")
					.append(i++ + "\t").append(i++ + "\t").append(i++ + "\t")
					.append(i++ + "\t").append(i++ + "\t").append(i++ + "\t")
					.append(i++ + "\t").append(i++ + "\t").append(i++ + "\t")
					.append(i++ + "\t");
			System.out.println(stb.toString());
		}
	}
}
