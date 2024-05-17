package copies;

import java.util.Scanner;
public class App {
	final static double prix1 = 0.10;
	final static double prix2 = 0.09;
	final static double prix3 = 0.08;
	
	public static void main(String[] args) {
		// Variables
		int nombreDeCopies;
		double montantDeLaFacture;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer le nombre de copies :");
		nombreDeCopies = sc.nextInt();
		
		if (nombreDeCopies <= 10) {
			montantDeLaFacture = nombreDeCopies * App.prix1;
		}
		else if (nombreDeCopies <= 30) {
			montantDeLaFacture  = App.prix1 * 10 + (nombreDeCopies - 10) * App.prix2;
		}
		else {
			montantDeLaFacture  = App.prix1 * 10 + App.prix2 * 20 + (nombreDeCopies - 30) * App.prix3;
		}
		
		System.out.println("Le montant de la facture est de " + montantDeLaFacture + "euros.");
		
	
	}

}
