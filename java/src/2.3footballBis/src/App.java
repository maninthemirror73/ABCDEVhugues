import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		int age;
		Scanner sc = new Scanner (System.in);

		System.out.println("Entrer l'âge du joueur");
		age = sc.nextInt();

		if(age < 5) {
			System.out.println("Trop jeune");
		}
		else if(age < 7) {
			System.out.println("Débutant");
		}
		else if(age < 9) {
			System.out.println("Poussin");
		}
		else if(age < 11) {
			System.out.println("Benjamin");
		}
		else if(age < 13) {
			System.out.println("Pupille");
		}
		else if(age < 15) {
			System.out.println("Minime");
		}
		else if(age < 17) {
			System.out.println("Cadet");
		}
		else if(age < 19) {
			System.out.println("Junior");
		}
		else if(age < 35) {
			System.out.println("Sénior");
		}
		else {
			System.out.println("Vétéran");
		}

		sc.close();

	}

}
