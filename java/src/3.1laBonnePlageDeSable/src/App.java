//package plageDeSable;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Variables
		int nombreChoisi = 3;
		int nombreSaisi;
		Scanner sc = new Scanner (System.in);

		//Traitement
		System.out.println(" Saisir un nombre entier entre 1 et 3 " );
		nombreSaisi = sc.nextInt();

		while (nombreSaisi != nombreChoisi) {
			System.out.println(" Resaisir un nombre entier entre 1 et 3 " );
			nombreSaisi = sc.nextInt();
		}

		System.out.println("Bravo, vous avez réussi ! ");

		sc.close();
	}
}
