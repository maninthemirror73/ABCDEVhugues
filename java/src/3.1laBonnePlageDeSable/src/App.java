//package plageDeSable;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Variables
<<<<<<< HEAD
		int nombreChoisi = 3;
=======
		int nombreChoisi = 2;
>>>>>>> 6ce18a34c6cf1d46e16ffbc2dfc62159770de242
		int nombreSaisi;
		Scanner sc = new Scanner (System.in);

		//Traitement
		System.out.println(" Saisir un nombre entier entre 1 et 3 " );
		nombreSaisi = sc.nextInt();

<<<<<<< HEAD
		while (nombreSaisi != nombreChoisi) {
=======
		while (nombreSaisi != nombreChoisi ) {
>>>>>>> 6ce18a34c6cf1d46e16ffbc2dfc62159770de242
			System.out.println(" Resaisir un nombre entier entre 1 et 3 " );
			nombreSaisi = sc.nextInt();
		}

		System.out.println("Bravo, vous avez réussi ! ");
		

		sc.close();
	}
}
