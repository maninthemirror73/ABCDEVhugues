import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int nombreDeDepart;
		int sommeDesEntiers = 0;
		int i = 0;
		Scanner sc = new Scanner (System.in);
		
		//TRAITEMENT
		
		System.out.println("Entrer un nombre entier :");
		nombreDeDepart = sc.nextInt();
		
		for (i = 0; i <= nombreDeDepart; i++) {
			sommeDesEntiers = sommeDesEntiers + i;
			/* sommeDesEntiers += i; */
	
		}
		System.out.println(sommeDesEntiers);
		
		
		
		sc.close();

	}

}
