import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		//VARIABLES
		int i = 1;
		int nombreDeDepart;
		Scanner sc = new Scanner (System.in);
		
		// TRAITEMENT
		
		System.out.println("Entrer le nombre de départ :");
		nombreDeDepart = sc.nextInt();
		
		/*
		 * for(i = 1; i <= 10; i++) { System.out.println(nombreDeDepart + i); }
		 */
		
		while (i <= 10) {
			System.out.println(nombreDeDepart + i);
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
