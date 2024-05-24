import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int nombreDeDepart;
		int factorielle = 1;
		int i;
		Scanner sc = new Scanner (System.in);
		
		//TRAITEMENT
		
		System.out.println("Entrer un nombre :");
		nombreDeDepart = sc.nextInt();
		
		for (i = 1; i <= nombreDeDepart; i++) {
			factorielle = factorielle * i;
		}
		System.out.println(factorielle );

		sc.close();
	}

}
