import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Esercizio 1
		System.out.println("Verifica se il numero di caratteri della stringa è pari o dispari");
		System.out.print("Inserisci una stringa: ");
		String inputString = scanner.nextLine();

		if (stringaPariDispari(inputString)) {
			System.out.println("Il numero dei caratteri è pari");
		} else {
			System.out.println("Il numero dei caratteri è dispari");
		}

		// Esercizio 2
		System.out.println("Verifica se un anno è bisestile");
		System.out.print("Inserisci un anno: ");
		int year = scanner.nextInt();

		if (annoBisestile(year)) {
			System.out.println("L'anno " + year + " è bisestile");
		} else {
			System.out.println("L'anno " + year + " non è bisestile");
		}

		scanner.close();
	}

	public static boolean stringaPariDispari(String str) {
		return str.length() % 2 == 0;
	}

	public static boolean annoBisestile(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
}
