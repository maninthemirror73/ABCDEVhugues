package positifOuNegatifBis2;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// Variables
		int nombre1;
		int nombre2;
		int produit;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer le premier nombre");
		nombre1 = sc.nextInt();
		
		System.out.println("Entrer le second nombre");
		nombre2 = sc.nextInt();
		
		produit = nombre1 * nombre2;
		
		if (produit >= 0) {
			System.out.println("Le produit est positif");
		}
		else {
			System.out.println("Le produit est négatif");
		}

		sc.close();

	}

}
