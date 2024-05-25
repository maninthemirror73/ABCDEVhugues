import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		//VARIABLES
		int nombre1;
		int nombre2;
		int produit;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entrer le nombre 1");
		nombre1 = sc.nextInt();
		
		System.out.println("Entrer le nombre 2");
		nombre2 = sc.nextInt();
		
		produit = nombre1 * nombre2;
		
		if (produit >= 0) {
			System.out.println("Produit positif");
		}
		else {
			System.out.println("Produit négatif");
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
