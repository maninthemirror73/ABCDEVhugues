import java.util.Scanner;
public class App {
	
	final static double prix1 = 0.1;
	final static double prix2 = 0.09;
	final static double prix3 = 0.08;
	
	public static void main(String[] args) {
		// VARIABLES
		
		int nombreDeCopies;
		double montantDeLaFacture;
		Scanner sc = new Scanner (System.in);
		
		//TRAITEMENT
		
		System.out.println("Entrer le nombre de copies");
		nombreDeCopies = sc.nextInt();
		
		if(nombreDeCopies <= 10) {
			montantDeLaFacture = nombreDeCopies * prix1;
		}
		else if (nombreDeCopies <= 30) {
			montantDeLaFacture = 10 * prix1 + (nombreDeCopies - 10) * prix2;
		}
		else {
			montantDeLaFacture = 10 * prix1 + 20 * prix2 + (nombreDeCopies - 30) * prix3;
		}
		
		System.out.println("Prix à payer : " + montantDeLaFacture);
		
		sc.close();

	}

}
