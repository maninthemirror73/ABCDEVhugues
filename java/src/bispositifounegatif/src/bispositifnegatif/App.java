package bispositifnegatif;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// variables
		int nombre1;
		int nombre2;
		int produit;
		Scanner sc;
		
		
		sc = new Scanner(System.in);
		
		
		System.out.println("Entrez le nombre 1");
		nombre1 = sc.nextInt();
		
		System.out.println("Entrez le nombre 2");
		nombre2 = sc.nextInt();
		
		produit = nombre1 * nombre2;
		System.out.println(produit);
		
		if (produit < 0) {
			System.out.println("Le produit est négatif");
		}
		else  {
			System.out.println("Le produit est positif");
		}
		sc.close();
	}

}
