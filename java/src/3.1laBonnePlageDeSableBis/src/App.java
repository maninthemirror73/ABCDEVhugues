import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		//VARIABLES
		
		int nombreSaisi;
		int nombreChoisi = 2;
		Scanner sc = new Scanner (System.in);
		
		//TRAITEMENT
		
		System.out.println("Entrer un nombre entre 1 et 3");
		nombreSaisi = sc.nextInt();
		
		while (nombreSaisi != nombreChoisi) {
			System.out.println("Entrer à nouveau un nombre entre 1 et 3");
			nombreSaisi = sc.nextInt();
		}
		System.out.println("Bravo vous avez réussi !");
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
