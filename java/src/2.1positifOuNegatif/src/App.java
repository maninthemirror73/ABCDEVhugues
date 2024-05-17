//package positifOuNegatif;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// Variables
		int nombre;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer un nombre entier");
		nombre = sc.nextInt();
		
		if(nombre >=0) {
			System.out.println("Le nombre est positif");
		}
		else {
			System.out.println("Le nombre est négatif");
		}
		
		sc.close();
			
	}

}

