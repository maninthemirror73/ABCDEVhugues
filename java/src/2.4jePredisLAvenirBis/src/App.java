import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int heures;
		int minutes;
		Scanner sc = new Scanner (System.in);
		
		// TRAITEMENT
		
		System.out.println("Entrer les heures :");
		heures = sc.nextInt();
		
		if (heures > 23) {
			System.out.println("Les données saisies sont invalides");
		}
		
		System.out.println("Entrer les minutes :");
		minutes = sc.nextInt();
		
		if (minutes > 56) {
			System.out.println("Les données saisies sont invalides");
		}
		
		System.out.println("Dans 3 minutes il sera " + heures + "h et " + (minutes + 3) + "minutes");

		sc.close();

	}

}
