package Esercizio2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner intero = new Scanner(System.in);
		System.out.print("Inserisci un numero intero: ");
		int num = intero.nextInt();

		if (num >= 0 && num <= 3) {
			String numLet = convertion(num);
			System.out.println("Il numero " + num + " in lettere è: " + numLet);
		} else {
			System.out.println("Errore: il numero deve essere compreso tra 0 e 3");
		}

		intero.close();
	}

	public static String convertion(int num) {
		String numLet;

		switch (num) {
		case 0:
			numLet = "zero";
			break;
		case 1:
			numLet = "uno";
			break;
		case 2:
			numLet = "due";
			break;
		case 3:
			numLet = "tre";
			break;
		default:
			numLet = "numero non valido";
			break;
		}
		return numLet;
	}

}
