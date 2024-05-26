import java.util.Scanner
public class App {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc = new Scanner (System.in);
		int i;
		int nombreDeDepart;
		int factorielle = 1;
		
		//TRAITEMENT
		
		System.out.println("Entrer un nombre entier :");
		nombreDeDepart = sc.nextInt();
		
		for(i = 1; i < nombreDeDepart; i++) {
			factorielle = factorielle * i;
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
