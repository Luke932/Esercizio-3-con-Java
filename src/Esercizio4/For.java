package Esercizio4;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner countdown = new Scanner(System.in);

		System.out.println("Inserisci un numero intero");
		int num = countdown.nextInt();

		System.out.println("Conto alla rovescia");

		for (int i = num; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("Fine del conto alla rovescia.");

		countdown.close();
	}

}
