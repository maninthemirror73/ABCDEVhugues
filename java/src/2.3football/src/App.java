import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		int ageDuJoueur;
		Scanner sc = new Scanner (System.in);
		
		//TRAITEMENT
		System.out.println("Entrer l'âge du joueur : ");
		ageDuJoueur = sc.nextInt();
		
		if (ageDuJoueur < 5) {
			System.out.println("Trop jeune !");
		}
		else if (ageDuJoueur < 7) {
			System.out.println("Débutant");
		}
		else if (ageDuJoueur < 9) {
			System.out.println("Poussin");
		}
		else if (ageDuJoueur < 11) {
			System.out.println("Benjamin");
		}
		else if (ageDuJoueur < 13) {
			System.out.println("Pupille");
		}
		else if (ageDuJoueur < 15) {
			System.out.println("Minime");
		}
		else if (ageDuJoueur < 17) {
			System.out.println("Cadet");
		}
		else if (ageDuJoueur < 19) {
			System.out.println("Junior");
		}
		else if (ageDuJoueur < 35) {
			System.out.println("Sénior");
		}
		else {
			System.out.println("Vétéran");
		}
		

		sc.close();
	}

}
