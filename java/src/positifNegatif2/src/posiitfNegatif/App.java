package posiitfNegatif;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// variable
		int A ;
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez un nombre entier");
		
		A = sc.nextInt();
		
		if (A<0) {
		System.out.println("Votre nombre est négatif");
		}
		
		else {
		System.out.println("Votre nombre est positif");	
		}
		sc.close();
	}

}
