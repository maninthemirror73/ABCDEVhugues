package minutesAjoutees;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// Variables
		int heures;
		int minutes;
		int minutesAjoutees = 3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez le nombre d'heures");
		heures = sc.nextInt();
		
		if(heures > 23) {
			System.out.println("Les données saisies sont invalides");
			System.exit(0);
		}
		System.out.println("Entrez le nombre de minutes");
		minutes = sc.nextInt();
		
		if(minutes > 56) {
			System.out.println("Les données saisies sont invalides");
			System.exit(0);
		}
		
		System.out.println("Dans 3 minutes il sera " + heures + "h et " + (minutes + minutesAjoutees) + " 67minutes");
		
		sc.close();
		
	
	}

}
