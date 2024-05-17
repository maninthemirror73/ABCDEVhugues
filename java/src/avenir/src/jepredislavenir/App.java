package jepredislavenir;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		//variables
		int heures;
		int minutes;
		int minutesajoutees;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entrer un nombre entier");
		heures = sc.nextInt();
		
		if (heures > 23) {
			System.out.println("Les données saisies sont invalides");
			System.exit(0);
			
		}
		
		System.out.println("Entrer un second nombre entier");
		minutes = sc.nextInt();
		
		
			if (minutes > 56) {
			System.out.println("Les données saisies sont invalides");
			System.exit(0);
			
		}
		
		
		minutesajoutees = 3;
		

		


		System.out.println("Dans 3 minutes il sera " + heures + "h " + (minutes + minutesajoutees));
		
		
		
		
		
		
		

	}

}
