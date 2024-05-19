//package bicyclette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		
		// VARIABLES
		boolean beauTemps = true;
		boolean veloOk = false;
		boolean reparationsImmediates = false;
		boolean livrePossede;
		boolean livreDispoBibliotheque;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ma Bicyclette");

		// TRAITEMENT
if (beauTemps) {
	
	System.out.println("Je vais me ballader");
	
	if (veloOk) {
		System.out.println("j'irai me ballader à bicyclette");
	}
	else {
		System.out.println("Je vais chez le garagiste");
		
		if (reparationsImmediates) {
			System.out.println("j'irai me ballader à bicyclette");	
		}
		else {
			System.out.println("J'irai cueillir des joncs");
		}
	}
	
}
else {
	System.out.println("je vais lire un livre");
}
		
		
		
		

		sc.close();
	}

}
