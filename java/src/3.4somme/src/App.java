import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		//VARIABLES
		
		int i;
		int nombreDeDepart = 0;
		int sommeDesEntiers = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entrer un nombre entier :");
		nombreDeDepart = sc.nextInt();
		
		
		for (i = 0; i <= nombreDeDepart; i++) {
			sommeDesEntiers = sommeDesEntiers + i;
		}
		
		System.out.println(sommeDesEntiers);
		
		sc.close();

	}

}
