package pseudofoot;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// Variables
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez l'age du joueur" );
		age = sc.nextInt();
		
		if (age < 5) {
			System.out.println("Trop jeune");
		}
		else if (age == 5 || age == 6) {
			System.out.println("Débutant");
		}
		else if (age == 7 || age == 8) {
			System.out.println("Poussin");
		}
		else if (age == 9 || age == 10) {
			System.out.println("Benjamin");
		}
		else if (age == 11 || age == 12) {
			System.out.println("Pupille");
		}
		else if (age == 13 || age == 14) {
			System.out.println("Minime");
		}
		else if (age == 15 || age == 16) {
			System.out.println("Cadet");
		}
		else if (age == 17 || age == 18) {
			System.out.println("Junior");
		}
		else if (age >= 19 && age <= 34) {
			System.out.println("Sénior");
		}
		else  {
			System.out.println("Vétéran");
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
