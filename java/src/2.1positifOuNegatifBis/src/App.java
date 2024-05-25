import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int nombreSaisi;
		Scanner sc = new Scanner (System.in);
		
		//TRAITEMENT
		
		System.out.println("Entrer un nombre entier :");
		nombreSaisi = sc.nextInt();
		
		if (nombreSaisi >= 0) {
			System.out.println("Nombre positif");
		}
		else {
			System.out.println("Nombre négatif");
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
