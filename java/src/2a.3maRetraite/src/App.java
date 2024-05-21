
public class App {

	public static void main(String[] args) {
		//VARIABLES
		int ageDeLaRetraite = 60;
		int A = 61;//age de la personne
		
		//TRAITEMENT
		if (A < 1 || A > 100) {
			System.out.println("Données non valides.");
			System.exit(0);
		}
		
		else if (A > 60) {
			System.out.println("Vous êtes à la retraite depuis " + (A - ageDeLaRetraite) + " années");
		}
		else if (A < 60) {
			System.out.println("Il vous reste " + (ageDeLaRetraite - A) + " années avant la retraite.");
		}
		else {
			System.out.println("C’est le moment de prendre sa retraite." );
		}
	}

}
