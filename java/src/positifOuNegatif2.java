import java.util.Scanner;
public class positifOuNegatif2 {
	public static void main(String[] args) {
		//VARIABLES
		int nombre1;
		int nombre2;
		int produit;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez entrer le premier nombre :");
		
		nombre1 = sc.nextInt();
		
		System.out.println("Veuillez entrer le second nombre :");
		
		nombre2 = sc.nextInt();
		
		produit = nombre1 * nombre2;
		
		System.out.println("Le produit de nombre1 et nombre2 est " + produit);
		
	}
}
