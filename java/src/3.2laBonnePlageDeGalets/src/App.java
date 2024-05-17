//package plageDeGalets;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {

		// Variables

	int nombreSaisi;
	String messagePlusPetit = " Plus petit ! ";
	String messagePlusGrand = " Plus grand ! ";
	String messageYesYouDidIt = " Yes you did it ! ";
	Scanner sc = new Scanner (System.in);

	//Traitement

	System.out.println("Entrer un nombre entre 10 et 20");
	nombreSaisi = sc.nextInt();

	while (nombreSaisi != 15 ) {
		if (nombreSaisi < 10 ) {
			System.out.println(messagePlusGrand);
		}
		else if (nombreSaisi > 20 ) {
			System.out.println(messagePlusPetit);
		}

		System.out.println("Entrer un nombre entre 10 et 20");
			nombreSaisi = sc.nextInt();
		}
		if (nombreSaisi == 15) {
			System.out.println(messageYesYouDidIt);
		}
		sc.close();


	}
}
