package photocopies;
import java.util.Scanner;
public class App {
	//Constantes
	final static double P1 = 0.10;
	final static double P2 = 0.09;
	final static double P3 = 0.08;

	public static void main(String[] args) {
		// Variables
		int nombreDeCopies;
		double montantDeLaFacture ;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entrer le nombre de copies");
		nombreDeCopies = sc.nextInt();
		
		if(nombreDeCopies <= 10) {
			montantDeLaFacture = nombreDeCopies * P1;
		}
		else if (nombreDeCopies <= 30) {
			montantDeLaFacture = 10 * P1 + (nombreDeCopies - 10) * P2;
		}
		else {
			montantDeLaFacture = 10 * P1 + 20 * P2 +(nombreDeCopies - 30) * P3;
		}
		
		System.out.println("A payer :" + montantDeLaFacture + " euros");
		
		
		
		
		
		
		
	}

}
