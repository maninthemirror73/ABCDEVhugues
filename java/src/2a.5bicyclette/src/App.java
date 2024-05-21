//package bicyclette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		
		// VARIABLES
		boolean beauTemps;
		boolean veloOk ;
		boolean reparationsImmediates ;
		boolean livrePossede ;
		boolean livreDispoBibliotheque ;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ma Bicyclette");

		// TRAITEMENT
if (beauTemps = true) {
	
	System.out.println("Je vais me ballader");
	
	if (veloOk = true) {
		System.out.println("j'irai me ballader à bicyclette");
	}
	else {
		System.out.println("Je vais chez le garagiste");
		
		if (reparationsImmediates = false) {
			System.out.println("j'irai me ballader à bicyclette");	
		}
		else {
			System.out.println("J'irai cueillir des joncs");
		}
	}
	
}
else {
	System.out.println("je vais lire un livre");
	
	if (livrePossede = false) {
		System.out.println("je vais à la bibliothèque");
		
		if (livreDispoBibliotheque = true) {
			System.out.println("J'emprunte GoT");
			
		}
		else {
			System.out.println("J'emprunte un roman policier");
		}
	}
}

		sc.close();
	}

}
