package Esercizio3;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner pippo = new Scanner(System.in);
		String input;

		do {
			System.out.print("Inserisci una stringa (':q' per uscire): ");
			input = pippo.nextLine();

			if (!input.equals(":q")) {
				suddividiStringa(input);
			}
		} while (!input.equals(":q"));
		pippo.close();
	}

	public static void suddividiStringa(String input) {
		System.out.println("Suddividi stringa");
		for (int i = 0; i < input.length(); i++) {
			char character = input.charAt(i);
			System.out.println(character);
			if (i != input.length() - 1) {
				System.out.println(",");
			}
		}
		System.out.println("Programma terminato");
	}
}
