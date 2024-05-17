package positifOuNegatifBisBis;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// variables
		int nombre1;
		int nombre2;
		int produit;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez le premier nombre");
		nombre1 = sc.nextInt(); 
		
		System.out.println("Entrez le second nombre");
		nombre2 = sc.nextInt(); 
		
		produit = nombre1 * nombre2;
		
		if (produit >= 0) {
			System.out.println("produit positif");
		}
		else {
			System.out.println("produit négatif");
		}
	
		sc.close();
	
	}   
	

}
