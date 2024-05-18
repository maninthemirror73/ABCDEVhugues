import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		double nombre1;
		double nombre2;
		double resultat; 		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entrer nombre entier 1");
		nombre1 = sc.nextInt();
		
		System.out.println("Entrer nombre entier 2");
		nombre2 = sc.nextInt();
		
		resultat = (nombre1 + nombre2)/2;
		
		System.out.println("La moyenne est : " + resultat);
		
		sc.close();

	}

}
