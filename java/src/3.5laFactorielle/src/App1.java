import java.util.Scanner;
public class App1 {

	public static void main(String[] args) {
		//VARIABLES
		
		int i;
		int nombreDeDepart;
		int factorielle = 1;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entrer un nombre entier :");
		nombreDeDepart = sc.nextInt();
		
		for (i = 1; i <= nombreDeDepart; i++) {
			factorielle = factorielle * i;
		}
		System.out.println(factorielle);

	}

}
